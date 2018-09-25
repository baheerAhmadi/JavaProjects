package com.us.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class MembershipInfo {
	@Id
	@GeneratedValue
	private long membership_id;
	private String membertype;
	private long uid;
	private Date membershipdate;
	private Double feesDue;
	private Double feesPaid;
	private String membershipTerm;
	private boolean isActive;
	private long updatedby;
	private Date updatedon; 
	@OneToOne
	@JoinColumn(name = "updatedby")
	private User user;
	@OneToOne
	@JoinColumn(name = "membership_id")
	private LendingBooks lendingbooks;
	
	
	public MembershipInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public MembershipInfo(long membership_id, String membertype, long uid, Date membershipdate, Double feesDue,
			Double feesPaid, String membershipTerm, boolean isActive, long updatedby, Date updatedon, User user,
			LendingBooks lendingbooks) {
		super();
		this.membership_id = membership_id;
		this.membertype = membertype;
		this.uid = uid;
		this.membershipdate = membershipdate;
		this.feesDue = feesDue;
		this.feesPaid = feesPaid;
		this.membershipTerm = membershipTerm;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.user = user;
		this.lendingbooks = lendingbooks;
	}

	public Date getUpdatedon() {
		return updatedon;
	}


	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}


	public long getMemberid() {
		return membership_id;
	}


	public void setMemberid(long memberid) {
		this.membership_id = memberid;
	}


	public String getMembertype() {
		return membertype;
	}


	public void setMembertype(String membertype) {
		this.membertype = membertype;
	}


	public long getUid() {
		return uid;
	}


	public void setUid(long uid) {
		this.uid = uid;
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


	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public LendingBooks getLendingbooks() {
		return lendingbooks;
	}

	public void setLendingbooks(LendingBooks lendingbooks) {
		this.lendingbooks = lendingbooks;
	}
	
}
