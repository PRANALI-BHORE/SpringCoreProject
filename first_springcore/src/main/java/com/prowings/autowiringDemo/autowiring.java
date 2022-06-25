package com.prowings.autowiringDemo;

public class autowiring {
	private Add add;

	public Add getAdd() {
		return add;
	}

	public void setAdd(Add add) {
		this.add = add;
	}

	public autowiring() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "autowiring [add=" + add + "]";
	}
	
	
	
}
