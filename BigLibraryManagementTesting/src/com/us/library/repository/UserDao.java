package com.us.library.repository;

import java.util.List;

import com.us.library.model.User;

public interface UserDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final User usr) throws Exception;
	public boolean update(final User usr) throws Exception;
	public boolean delete(final User usr) throws Exception;
	public User find(int id) throws Exception;
	public List<User> findAll() throws Exception;
}
