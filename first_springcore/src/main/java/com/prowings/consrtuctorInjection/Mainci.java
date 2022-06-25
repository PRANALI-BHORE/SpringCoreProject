package com.prowings.consrtuctorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainci {
	public static void main(String[] args) {
		ApplicationContext cntxt=new ClassPathXmlApplicationContext("com/prowings/consrtuctorInjection/constructorconfig.xml");
		
		Studentci std1=(Studentci)cntxt.getBean("std1");
		System.out.println(std1);
	}
	
}
