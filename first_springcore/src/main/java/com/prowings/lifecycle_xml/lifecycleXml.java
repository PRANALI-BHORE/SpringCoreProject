package com.prowings.lifecycle_xml;

public class lifecycleXml {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public lifecycleXml() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "lifecycleXml [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Initialized....");
	}
	
	public void destroy() {
		System.out.println("Destroyed....");
	}
}
