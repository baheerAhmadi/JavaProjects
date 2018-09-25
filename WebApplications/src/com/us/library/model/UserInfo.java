package com.us.library.model;

import java.util.Date;

public class UserInfo {
	
	private long user_type_id;
	private long address_id;
	private long user_info_id;
	private String name;
	private String idproof;
	private Date dob;
	private String emailid;
	private boolean isActive;
	private long updatedby;
	private Date updatedon;
	private Address address;
	private UserType usertype;
	
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(long user_type_id, long address_id, long user_info_id, String name, String idproof, Date dob,
			String emailid, boolean isActive, long updatedby, Date updatedon, Address address, 
			UserType usertype) {
		super();
		this.user_type_id = user_type_id;
		this.address_id = address_id;
		this.user_info_id = user_info_id;
		this.name = name;
		this.idproof = idproof;
		this.dob = dob;
		this.emailid = emailid;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.address = address;
		//this.user = user;
		this.usertype = usertype;
	}
	
	
	public long getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(long user_type_id) {
		this.user_type_id = user_type_id;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public long getUser_info_id() {
		return user_info_id;
	}
	public void setUser_info_id(long user_info_id) {
		this.user_info_id = user_info_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	/*public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	public UserType getUsertype() {
		return usertype;
	}
	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}	
	
	
}
