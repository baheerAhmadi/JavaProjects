package com.us.library.repository;

import java.util.List;

import com.us.library.model.UserInfo;

public interface UserInfoDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final UserInfo usrinfo) throws Exception;
	public boolean update(final UserInfo usrinfo) throws Exception;
	public boolean delete(final UserInfo usrinfo) throws Exception;
	public UserInfo find(int id) throws Exception;
	public List<UserInfo> findAll() throws Exception;
}
