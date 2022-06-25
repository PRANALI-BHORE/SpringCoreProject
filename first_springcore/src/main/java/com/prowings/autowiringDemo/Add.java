package com.prowings.autowiringDemo;

public class Add {
	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Add [street=" + street + ", city=" + city + "]";
	}
	public Add(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	
}
