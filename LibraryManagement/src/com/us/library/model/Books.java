/**
 * 
 */
package com.us.library.model;

import java.util.Date;

/**
 * @author ADARI
 *
 */

public class Books {
	
	private long book_id;
	private String bookname;
	private String description;
	private String author;
	private Double price;
	private long categoryid;
	private long quantity;
	private boolean isActive;
	private long updatedby;
	private Date updatedon; 
	BooksCategory bookscategory;
	private LendingBooks lendingbooks;
	
	

	public Books() {
		// TODO Auto-generated constructor stub
	}
	
	public Books(long book_id, String bookname, String description, String author, Double price, long categoryid,
			long quantity, boolean isActive, long updatedby, Date updatedon, BooksCategory bookscategory, 
			LendingBooks lendingbooks) {
		super();
		this.book_id = book_id;
		this.bookname = bookname;
		this.description = description;
		this.author = author;
		this.price = price;
		this.categoryid = categoryid;
		this.quantity = quantity;
		this.isActive = isActive;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
		this.bookscategory = bookscategory;

		this.lendingbooks = lendingbooks;
	}






	public long getBook_id() {
		return book_id;
	}



	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}



	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public long getCategoryid() {
		return categoryid;
	}



	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}



	public long getQuantity() {
		return quantity;
	}



	public void setQuantity(long quantity) {
		this.quantity = quantity;
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
	public BooksCategory getBookscategory() {
		return bookscategory;
	}
	public void setBookscategory(BooksCategory bookscategory) {
		this.bookscategory = bookscategory;
	}
	public LendingBooks getLendingbooks() {
		return lendingbooks;
	}

	public void setLendingbooks(LendingBooks lendingbooks) {
		this.lendingbooks = lendingbooks;
	}
	
}
