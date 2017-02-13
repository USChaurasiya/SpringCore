package com.uma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
	
	DataCollection dc=(DataCollection) context.getBean("dataCollection");
	dc.getAddressList();
	dc.getAddressSet();
	dc.getAddressMap();
}
}
