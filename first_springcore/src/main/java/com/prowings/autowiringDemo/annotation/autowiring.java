package com.prowings.autowiringDemo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@AllArgsConstructor 
public class autowiring {
	@Autowired
	@Qualifier("add2")
	@Getter
	@Setter
	
	private Add add;

	
	
}
