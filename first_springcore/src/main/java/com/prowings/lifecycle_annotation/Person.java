package com.prowings.lifecycle_annotation;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

public class Person {
	private String hobby;

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [hobby=" + hobby + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Initialized...");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroyed...");
	}
}
