package com.prowings.consrtuctorInjection;

import java.util.List;

public class Addressci {
	private List<String> ciCity;
	private int ciPincode;
	
	public Addressci(List<String> ciCity, int ciPincode) {
		super();
		this.ciCity = ciCity;
		this.ciPincode = ciPincode;
	}
	public Addressci() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Addressci [ciCity=" + ciCity + ", ciPincode=" + ciPincode + "]";
	}
	
	
	
}
