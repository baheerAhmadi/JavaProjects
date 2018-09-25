package com.us.library.model;

import java.util.Date;

public class LendingBooks {

	private long book_lending_id;
	private long book_id;
	private long membership_id;
	private Date book_issue_date;
	private Date expected_submission_date;
	private Date actual_submission_date;
	private boolean is_submitted;
	private boolean isActive;
	private long updatedby;
	private Date updatedon;
	private MembershipInfo membershipinfo;
	private Books books;
	
	public LendingBooks() {
		// TODO Auto-generated constructor stub
	}
	
	public LendingBooks(long book_lending_id, long book_id, long membership_id, Date book_issue_date,
			Date expected_submission_date, Date actual_submission_date, boolean is_submitted, boolean isActive,
			long updatedby, Date updatedon, MembershipInfo membershipinfo, Books books) {
		super();
		this.book_lending_id = book_lending_id;
		this.book_id = book_id;
		this.membership_id = membership_id;
		this.book_issue_date = book_issue_date;
		this.expected_submission_date = expected_submission_date;
		this.actual_submission_date = actual_submission_date;
		this.is_submitted = is_submitted;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.membershipinfo = membershipinfo;
		this.books = books;
	}


	public long getBook_lending_id() {
		return book_lending_id;
	}


	public void setBook_lending_id(long book_lending_id) {
		this.book_lending_id = book_lending_id;
	}


	public long getBook_id() {
		return book_id;
	}


	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}


	public long getMembership_id() {
		return membership_id;
	}


	public void setMembership_id(long membership_id) {
		this.membership_id = membership_id;
	}


	public Date getBook_issue_date() {
		return book_issue_date;
	}


	public void setBook_issue_date(Date book_issue_date) {
		this.book_issue_date = book_issue_date;
	}


	public Date getExpected_submission_date() {
		return expected_submission_date;
	}


	public void setExpected_submission_date(Date expected_submission_date) {
		this.expected_submission_date = expected_submission_date;
	}


	public Date getActual_submission_date() {
		return actual_submission_date;
	}


	public void setActual_submission_date(Date actual_submission_date) {
		this.actual_submission_date = actual_submission_date;
	}


	public boolean isIs_submitted() {
		return is_submitted;
	}


	public void setIs_submitted(boolean is_submitted) {
		this.is_submitted = is_submitted;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}	public long getUpdatedby() {
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


	public Books getBooks() {
		return books;
	}


	public void setBooks(Books books) {
		this.books = books;
	}
	
}
