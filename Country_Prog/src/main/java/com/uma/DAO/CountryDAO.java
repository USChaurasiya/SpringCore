package com.uma.DAO;

import java.util.Collection;

import com.uma.Model.Country;

public interface CountryDAO {

	public Collection<Country> getAll();
	 
	public Country getById(int id);
	 
	public Country getByName(String countryName);
	 
	public void save(Country country);
	 
	public void delete(int id);
	
	public int updateRow(Country country);
}
