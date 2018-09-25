package com.us.library.model;

import java.util.Date;

public class UserType {

	private long user_type_id;
	private String usertype;
	private String description;
	private boolean isActive;
	private long updatedby;
	private Date updatedon;

	
	public UserType() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserType(long user_type_id, String usertype, String description, boolean isActive, long updatedby,
			Date updatedon) {
		super();
		this.user_type_id = user_type_id;
		this.usertype = usertype;
		this.description = description;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
	
	}


	public long getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(long user_type_id) {
		this.user_type_id = user_type_id;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
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

	
}
