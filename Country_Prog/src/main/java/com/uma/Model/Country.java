package com.uma.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Country implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="CTRY_ID")
	private Integer id;
	 
	@Column(name="CTRY_NAME")
	private String name;
	 
	@Column(name="CTRY_AREA")
	private Integer area;
	 
	@Column(name="CTRY_POP")
	private Long population;
	 
	
	@Column(name="CURRENCY")
	private String currency;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(Integer id, String name, Integer area, Long population,String currency) {
		setId(id);
		setName(name);
		setArea(area);
		setPopulation(population);
		setCurrency(currency);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
