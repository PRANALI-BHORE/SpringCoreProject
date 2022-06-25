package com.prowings.autowiringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowiringMain {

		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("com/prowings/autowiringDemo/autowiringconfig.xml");
			autowiring a=context.getBean("a", autowiring.class);
			System.out.println(a);
		}
}
