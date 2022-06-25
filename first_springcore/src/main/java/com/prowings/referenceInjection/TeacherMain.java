package com.prowings.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMain {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/prowings/referenceInjection/refconfig.xml");
		
		Teacher teacher1=(Teacher) context.getBean("teacher1");
		System.out.println(teacher1.getTeacherName());
		System.out.println(teacher1.getSubject());
		System.out.println(teacher1);
	}
}
