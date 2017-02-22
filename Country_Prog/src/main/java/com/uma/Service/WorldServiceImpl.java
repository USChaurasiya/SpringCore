package com.uma.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uma.DAO.CountryDAO;
import com.uma.Model.Country;
@Component
public class WorldServiceImpl implements WorldService{

	@Autowired
	private CountryDAO countryDAO;
	 
	public Collection<Country> getAllCountries() {
		return countryDAO.getAll();
	}

	public Country getCountryById(int id) {
		return countryDAO.getById(id);
	}

	public Country getCountryByName(String countryName) {
		return countryDAO.getByName(countryName);
	
	}

	public void saveCountry(Country country) {
		countryDAO.save(country);
		
	}

	public void deleteCountry(int id) {
		countryDAO.delete(id);
		
	}
	public int updateRow(Country country) {
		return countryDAO.updateRow(country);
	}


}
