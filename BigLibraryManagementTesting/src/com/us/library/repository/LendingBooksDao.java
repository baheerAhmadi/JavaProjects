package com.us.library.repository;

import java.util.List;

import com.us.library.model.LendingBooks;

public interface LendingBooksDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final LendingBooks lendingbooks) throws Exception;
	public boolean update(final LendingBooks lendingbooks) throws Exception;
	public boolean delete(final LendingBooks lendingbooks) throws Exception;
	public LendingBooks find(int id) throws Exception;
	public List<LendingBooks> findAll() throws Exception;
}
