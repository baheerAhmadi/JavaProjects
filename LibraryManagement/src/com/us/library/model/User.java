package com.us.library.model;

import java.util.Date;;
public class User {
	
	private long library_id;
	private String username;
	private String password;
	private boolean isActive;
	private long updatedby;
	private Date updatedon;
	private MembershipInfo membershipinfo;
	private UserInfo userinfo;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long library_id, String username, String password, boolean isActive, long updatedby, Date updatedon,
			MembershipInfo membershipinfo, UserInfo userinfo) {
		super();
		this.library_id = library_id;
		this.username = username;
		this.password = password;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.membershipinfo = membershipinfo;
		this.userinfo = userinfo;
	}


	public long getLibrary_id() {
		return library_id;
	}

	public void setLibrary_id(long library_id) {
		this.library_id = library_id;
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

	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
}