package com.us.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.model.BooksCategory;
import com.us.library.model.UserInfo;
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	HibernateTemplate ht;
	
	@Override
	public int save(UserInfo usrinfo) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(usrinfo);
	}

	@Override
	public boolean update(UserInfo usrinfo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(usrinfo);
		return true;
	}

	@Override
	public boolean delete(UserInfo usrinfo) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(usrinfo);
		return true;
	}

	@Override
	public UserInfo find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (UserInfo)ht.get(UserInfo.class, id);
	}

	@Override
	public List<UserInfo> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<UserInfo> libraryuserinfo= ht.find("from libraryuserinfo");
		return libraryuserinfo;
	}

}
