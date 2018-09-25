package com.us.library.model;

import java.util.Date;

public class BooksCategory {
	
	private long categoryid;
	private String subjectname;
	private String subjectdesc;
	private boolean isActive;
	private long updatedby;
	private Date updatedon; 
	
	public BooksCategory() {
		// TODO Auto-generated constructor stub
	}
	
	public BooksCategory(long categoryid, String subjectname, String subjectdesc, boolean isActive, long updatedby,
			Date updatedon) {
		super();
		this.categoryid = categoryid;
		this.subjectname = subjectname;
		this.subjectdesc = subjectdesc;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		
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


}
