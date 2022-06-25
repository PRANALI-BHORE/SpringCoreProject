package com.prowings.consrtuctorInjection;

public class Studentci {
	private int ciId;
	private String ciName;
	private Addressci ciAddress;
	

	public int getCiId() {
		return ciId;
	}
	public void setCiId(int ciId) {
		System.out.println("id setter called");
		this.ciId = ciId;
	}
	public String getCiName() {
		return ciName;
	}
	public void setCiName(String ciName) {
		System.out.println("name setter called");
		this.ciName = ciName;
	}
	public Addressci getCiAddress() {
		return ciAddress;
	}
	public void setCiAddress(Addressci ciAddress) {
		System.out.println("address setter called");
		this.ciAddress = ciAddress;
	}
	public Studentci() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentci(int ciId, String ciName, Addressci ciAddress) {
		super();
		System.out.println("constructor called");
		this.ciId = ciId;
		this.ciName = ciName;
		this.ciAddress = ciAddress;
	}
	@Override
	public String toString() {
		return "Studentci [ciId=" + ciId + ", ciName=" + ciName + ", ciAddress=" + ciAddress + "]";
	}
	
	
	
}
