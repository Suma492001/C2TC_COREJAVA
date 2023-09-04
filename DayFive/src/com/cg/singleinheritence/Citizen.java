package com.cg.singleinheritence;

public class Citizen {
	
	private String name;
	private String dateofBirth;
	private String address;
	private String aadharNo;
	private long phoneNo;
	
	
	public Citizen() {
		System.out.println
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", dateofBirth=" + dateofBirth + ", address=" + address + ", aadharNo="
				+ aadharNo + ", phoneNo=" + phoneNo + ", getName()=" + getName() + ", getDateofBirth()="
				+ getDateofBirth() + ", getAddress()=" + getAddress() + ", getAadharNo()=" + getAadharNo()
				+ ", getPhoneNo()=" + getPhoneNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
