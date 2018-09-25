package com.us.library.model;

import java.util.Date;

public class MembershipInfo {

	private long membership_id;
	private String membertype;
	private Date membershipdate;
	private Double feesDue;
	private Double feesPaid;
	private String membershipTerm;
	private boolean isActive;
	private long updatedby;
	private Date updatedon; 
	
	
	
	public MembershipInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MembershipInfo(long membership_id, String membertype, Date membershipdate, Double feesDue, Double feesPaid,
			String membershipTerm, boolean isActive, long updatedby, Date updatedon) {
		super();
		this.membership_id = membership_id;
		this.membertype = membertype;
		this.membershipdate = membershipdate;
		this.feesDue = feesDue;
		this.feesPaid = feesPaid;
		this.membershipTerm = membershipTerm;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		//this.user = user;
	}
	
	public long getMembership_id() {
		return membership_id;
	}
	public void setMembership_id(long membership_id) {
		this.membership_id = membership_id;
	}
	public String getMembertype() {
		return membertype;
	}
	public void setMembertype(String membertype) {
		this.membertype = membertype;
	}
	public Date getMembershipdate() {
		return membershipdate;
	}
	public void setMembershipdate(Date membershipdate) {
		this.membershipdate = membershipdate;
	}
	public Double getFeesDue() {
		return feesDue;
	}
	public void setFeesDue(Double feesDue) {
		this.feesDue = feesDue;
	}
	public Double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(Double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public String getMembershipTerm() {
		return membershipTerm;
	}
	public void setMembershipTerm(String membershipTerm) {
		this.membershipTerm = membershipTerm;
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
	/*public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}		
}
