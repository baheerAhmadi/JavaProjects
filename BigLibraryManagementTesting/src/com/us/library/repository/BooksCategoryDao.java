package com.us.library.repository;

import java.util.List;

import com.us.library.model.BooksCategory;

public interface BooksCategoryDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final BooksCategory bookscategory) throws Exception;
	public boolean update(final BooksCategory bookscategory) throws Exception;
	public boolean delete(final BooksCategory bookscategory) throws Exception;
	public BooksCategory find(int id) throws Exception;
	public List<BooksCategory> findAll() throws Exception;
}
