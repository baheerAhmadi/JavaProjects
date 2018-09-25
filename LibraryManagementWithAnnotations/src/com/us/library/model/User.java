package com.us.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;;
@Entity
@Table(name = "LibraryUser")
public class User {
	@Id
	@GeneratedValue
	private long uid;
	private String username;
	private String password;
	private boolean isActive;
	private long updatedby;
	private Date updatedon;
	@OneToOne
	@JoinColumn(name = "uid")
	private MembershipInfo membershipinfo;
	@OneToOne
	@JoinColumn(name = "uid")
	private UserInfo userinfo;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public User(long uid, String username, String password, boolean isActive, long updatedby, Date updatedon,
			MembershipInfo membershipinfo, UserInfo userinfo) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.membershipinfo = membershipinfo;
		this.userinfo = userinfo;
	}



	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public MembershipInfo getMembershipinfo() {
		return membershipinfo;
	}
	public void setMembershipinfo(MembershipInfo membershipinfo) {
		this.membershipinfo = membershipinfo;
	}



	public UserInfo getUserinfo() {
		return userinfo;
	}



	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	
	
}