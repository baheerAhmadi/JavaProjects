package com.us.library.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserInfo {
	@Id
	@GeneratedValue
	private long uid;
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
	@OneToOne
	@JoinColumn(name = "address_id")
	private Set<Address> address;
	private User user;
	private UserType usertype;
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(long uid, long user_type_id, long address_id, long user_info_id, String name, String idproof,
			Date dob, String emailid, boolean isActive, long updatedby, Date updatedon, Set<Address> address, User user,
			UserType usertype) {
		super();
		this.uid = uid;
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
		this.user = user;
		this.usertype = usertype;
	}

	public long getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(long user_type_id) {
		this.user_type_id = user_type_id;
	}
	
	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public long getUsertypeid() {
		return user_type_id;
	}
	public void setUsertypeid(long user_type_id) {
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
	public UserType getUsertype() {
		return usertype;
	}
	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}
	
}
