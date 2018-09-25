package com.us.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.model.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	HibernateTemplate ht;
	@Override
	public int save(User usr) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(usr);
	}

	@Override
	public boolean update(User usr) throws Exception {
		// TODO Auto-generated method stub
		ht.update(usr);
		return true;
	}

	@Override
	public boolean delete(User usr) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(usr);
		return true;
	}

	@Override
	public User find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (User)ht.get(User.class, id);
	}


	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<User> libraryuser= ht.find("from libraryuser");
		return libraryuser;
	}

}



