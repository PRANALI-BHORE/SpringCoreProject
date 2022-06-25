package com.prowings.lifecycle_xml;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifecyclemain {
	public static void main(String[] args) {
		
		AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("com/prowings/lifecycle_xml/lifecycleconfig.xml");
		context.registerShutdownHook();
		
		lifecycleXml lcxml=(lifecycleXml)context.getBean("lcxml");
		System.out.println(lcxml);
	}
}
