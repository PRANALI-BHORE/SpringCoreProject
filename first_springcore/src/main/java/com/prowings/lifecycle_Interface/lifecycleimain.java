package com.prowings.lifecycle_Interface;


import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifecycleimain {
	
	public static void main(String[] args) {
		
	AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("com/prowings/lifecycle_Interface/lifecycleiconfig.xml");
	context.registerShutdownHook();
	
	
	lifecycleInterface lci=(lifecycleInterface)context.getBean("lci");
	System.out.println(lci);
	
	}
}