package com.uma.Model;
public class Train 
{
	private Integer id;
	private String name;
	private Integer compartment;
	private String source;
	private String destination;
	private int speed;
	
	public Train(Integer id,String name,Integer compartment,String source,String destination,int speed)
	{
		setId(id);
		setName(name);
		setCompartment(compartment);
		setSource(source);
		setDestination(destination);
		setSpeed(speed);
	}
	
	public boolean isNew()
	{
		return id==null;
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

	public Integer getCompartment() {
		return compartment;
	}

	public void setCompartment(Integer compartment) {
		this.compartment = compartment;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed( int speed) {
		this.speed = speed;
	}
	
}
