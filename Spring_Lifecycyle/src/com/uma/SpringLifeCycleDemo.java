package com.uma;

public class SpringLifeCycleDemo 
{
	private String message;

	public void getMessage() {
		System.out.println("Your message:"+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init()
	{
		System.out.println("Bean initialization..");
	}
	public void destroy()
	{
		System.out.println("Bean Destroyed...");
	}
	
	
}
