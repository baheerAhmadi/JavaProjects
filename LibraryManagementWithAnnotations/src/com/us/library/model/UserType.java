package com.us.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class UserType {
	@Id
	@GeneratedValue
	private long user_type_id;
	private String usertype;
	private String description;
	private boolean isActive;
	private long updatedby;
	private Date updatedon;
	@OneToOne
	@JoinColumn(name = "updatedby")
	private User user;
	
	public UserType() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserType(long user_type_id, String usertype, String description, boolean isActive, long updatedby,
			Date updatedon, User user) {
		super();
		this.user_type_id = user_type_id;
		this.usertype = usertype;
		this.description = description;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.user = user;
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
