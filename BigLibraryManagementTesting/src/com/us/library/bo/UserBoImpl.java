package com.us.library.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.us.library.model.User;
import com.us.library.repository.UserDao;
@Service
@Transactional
public class UserBoImpl implements UserBo {

	@Autowired
	private UserDao dao;
	@Override
	public int createUser(User user) throws Exception {
		return dao.save(user);
	}

	@Override
	public boolean updateUser(User user) throws Exception{
			return dao.update(user);
	}

	@Override
	public boolean deleteUser(User user)  throws Exception {
		return dao.delete(user);
	}

	@Override
	@Transactional(readOnly=true)
	public User selectUser(int id) throws Exception {
		return dao.find(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> selectAllUser() throws Exception {
				return dao.findAll();
	}

}
