package com.prowings.lifecycle_Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class lifecycleInterface implements InitializingBean, DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public lifecycleInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "lifecycleInterface [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init");
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy");
	}
	
	
}
