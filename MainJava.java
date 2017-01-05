package com.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJava {

	public static void main(String[] args) {
		
		ApplicationContext cin = new ClassPathXmlApplicationContext("inject.xml");
		
		Check ted = (Check) cin.getBean("Check");
		ted.show();
		
	}
	
}
