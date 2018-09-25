package com.us.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Address {
	
	@Id
	@GeneratedValue
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
	@OneToOne
	@JoinColumn(name = "updatedby")
	private User user;
	
	public Address() {
	}
	
	public Address(long address_id, String line1, String line2, String city, String state, int zipcode, String country,
		boolean isActive, long updatedby, Date updatedon) 
	{
	super();
	this.address_id = address_id;
	this.line1 = line1;
	this.line2 = line2;
	City = city;
	this.state = state;
	this.zipcode = zipcode;
	this.country = country;
	this.isActive = isActive;
	this.updatedby = updatedby;
	this.updatedon = updatedon;
	}



	public long getAddress_id() {
		return address_id;
	}


	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}


	public String getLine1() {
		return line1;
	}


	public void setLine1(String line1) {
		this.line1 = line1;
	}


	public String getLine2() {
		return line2;
	}


	public void setLine2(String line2) {
		this.line2 = line2;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public long getUpdatedby() {
		return updatedby;
	}


	public void setUpdatedby(long updatedby) {
		this.updatedby = updatedby;
	}


	public Date getUpdatedon() {
		return updatedon;
	}


	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	

}
