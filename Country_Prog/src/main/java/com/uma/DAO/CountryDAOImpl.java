package com.uma.DAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.uma.Model.Country;
@Controller
public class CountryDAOImpl implements CountryDAO{

	@Autowired
	 SessionFactory sessionFactory;
	
	public Collection<Country> getAll() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Country> countryList = session.createQuery("from Country")
				.list();
		session.close();
		return countryList;
	}

	public Country getById(int id) {
		Session session = sessionFactory.openSession();
		Country country = (Country) session.load(Country.class, id);
		return country;
	}

	public Country getByName(String countryName) {
		return (Country) sessionFactory.getCurrentSession().createQuery("from Country ctry " +
					"where ctry.name = :name").setParameter("name", countryName).uniqueResult();
	}
	@Transactional
	public void save(Country country) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(country);
		tx.commit();
		Serializable id = session.getIdentifier(country);
		session.close();
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Country country = (Country)session.load(Country.class, (Serializable) id);
		session.delete(country);
		tx.commit();
		Serializable ids = session.getIdentifier(country);
		session.close();
		
		
	}
	public int updateRow(Country country) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(country);
		tx.commit();
		Serializable id = session.getIdentifier(country);
		session.close();
		return (Integer) id;
	}

}
