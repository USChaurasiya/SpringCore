package com.uma.Service;

import java.util.Collection;

import com.uma.Model.Country;

public interface WorldService {
	public Collection<Country> getAllCountries();
	 
	public Country getCountryById(int id);
	 
	public Country getCountryByName(String countryName);
	 
	public void saveCountry(Country country);
	 
	public void deleteCountry(int id);
	
	public int updateRow(Country country);
	 
}
