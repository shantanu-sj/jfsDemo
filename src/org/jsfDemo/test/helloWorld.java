package org.jsfDemo.test;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class helloWorld {
	
	
	public helloWorld() {
		System.out.println("Started");
	}
	
	
	
	
	public String getMessage() {
		
		return "Hello World" ;
	}
	
}
