package com.prowings.lifecycle_annotation;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Personmain {

	public static void main(String[] args) {
		AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("com/prowings/lifecycle_annotation/annotationconfig.xml");
		context.registerShutdownHook();
		
		Person p=(Person)context.getBean("p");
		System.out.println(p);
		
	}
}
