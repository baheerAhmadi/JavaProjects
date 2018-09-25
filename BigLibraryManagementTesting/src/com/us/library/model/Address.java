package com.us.library.model;

import java.util.Date;

public class Address {
	
	private long address_id;
	private String line1;
	private String line2;
	private String City;
	private String state;
	private int zipcode;
	private String country;
	private boolean isActive;
	private long updatedby;
	private Date updatedon; 

	
	public Address() {
	}
	
	public Address(String line1, String line2, String city, String state, int zipcode, String country,
		long updatedby,Date dt) 
	{
	super();
	//this.address_id = address_id;
	this.line1 = line1;
	this.line2 = line2;
	City = city;
	this.state = state;
	this.zipcode = zipcode;
	this.country = country;

	this.updatedby = updatedby;
	this.updatedon=dt;
	
	}

	
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public void setCity(String city) {
		City = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setUpdatedby(long updatedby) {
		this.updatedby = updatedby;
	}

	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}

	public long getAddress_id() {
		return address_id;
	}

	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public String getCountry() {
		return country;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public long getUpdatedby() {
		return updatedby;
	}

	public Date getUpdatedon() {
		return updatedon;
	}



}
