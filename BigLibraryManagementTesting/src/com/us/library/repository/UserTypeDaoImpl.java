package com.us.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.model.BooksCategory;
import com.us.library.model.UserType;
@Repository
public class UserTypeDaoImpl implements UserTypeDao {
	@Autowired
	HibernateTemplate ht;
	
	@Override
	public int save(UserType usrtype) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(usrtype);
	}

	@Override
	public boolean update(UserType usrtype) throws Exception {
		// TODO Auto-generated method stub
		ht.update(usrtype);
		return true;
	}

	@Override
	public boolean delete(UserType usrtype) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(usrtype);
		return true;
	}

	@Override
	public UserType find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (UserType)ht.get(UserType.class, id);
	}

	@Override
	public List<UserType> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<UserType> libraryusertype= ht.find("from libraryusertype");
		return libraryusertype;
	}

}
