package com.us.library.bo;

import java.util.List;

import com.us.library.model.User;

public interface UserBo {

	public int createUser(User user) throws Exception;
	public boolean updateUser(User user)throws Exception;
	public boolean deleteUser(User user)throws Exception;
	public User selectUser(int id)throws Exception;
	public List<User> selectAllUser()throws Exception;
	
}
