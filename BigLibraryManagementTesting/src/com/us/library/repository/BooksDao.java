package com.us.library.repository;

import java.util.List;

import com.us.library.model.Books;

public interface BooksDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final Books books) throws Exception;
	public boolean update(final Books books) throws Exception;
	public boolean delete(final Books books) throws Exception;
	public Books find(int id) throws Exception;
	public List<Books> findAll() throws Exception;
}
