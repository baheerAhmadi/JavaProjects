package com.us.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.model.BooksCategory;
import com.us.library.model.MembershipInfo;

@Repository
public class MembershipInfoDaoImpl implements MembershipInfoDao {

	@Autowired
	HibernateTemplate ht;
	
	@Override
	public int save(MembershipInfo membershipinfo) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(membershipinfo);
	}

	@Override
	public boolean update(MembershipInfo membershipinfo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(membershipinfo);
		return true;
	}

	@Override
	public boolean delete(MembershipInfo membershipinfo) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(membershipinfo);
		return true;
	}

	@Override
	public MembershipInfo find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (MembershipInfo)ht.get(MembershipInfo.class, id);
	}

	@Override
	public List<MembershipInfo> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<MembershipInfo> membershipinfo= ht.find("from membershipinfo");
		return membershipinfo;
	}

}




