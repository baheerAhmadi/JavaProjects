package com.us.library.repository;

import java.util.List;

import com.us.library.model.UserType;

public interface UserTypeDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final UserType usrtype) throws Exception;
	public boolean update(final UserType usrtype) throws Exception;
	public boolean delete(final UserType usrtype) throws Exception;
	public UserType find(int id) throws Exception;
	public List<UserType> findAll() throws Exception;
}
