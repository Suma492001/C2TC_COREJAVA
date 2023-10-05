//Demonstration using 

package com.cg.userdefinedobjects;

public class person {
	
	private String name;
	private String city;
	
	public person() {
		super();
	}
	
	public person(String name,String city) {
		super();
		this.name =name;
		this.city=city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}

}
