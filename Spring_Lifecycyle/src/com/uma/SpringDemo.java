package com.uma;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo 
{
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
		SpringLifeCycleDemo springLifeCycleDemo=(SpringLifeCycleDemo) context.getBean("message");
		springLifeCycleDemo.getMessage();
		context.registerShutdownHook();
	}
}
