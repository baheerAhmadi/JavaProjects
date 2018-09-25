package com.us.library.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class BooksCategory {
	@Id
	@GeneratedValue
	private long categoryid;
	private String subjectname;
	private String subjectdesc;
	private boolean isActive;
	private long updatedby;
	private Date updatedon; 
	@OneToOne
	@JoinColumn(name = "updatedby")
	private User user;
	
	public BooksCategory() {
		// TODO Auto-generated constructor stub
	}
	
	public BooksCategory(long categoryid, String subjectname, String subjectdesc, boolean isActive, long updatedby,
			Date updatedon, User user) {
		super();
		this.categoryid = categoryid;
		this.subjectname = subjectname;
		this.subjectdesc = subjectdesc;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.user = user;
	}


	public long getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}


	public String getSubjectname() {
		return subjectname;
	}


	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}


	public String getSubjectdesc() {
		return subjectdesc;
	}


	public void setSubjectdesc(String subjectdesc) {
		this.subjectdesc = subjectdesc;
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
