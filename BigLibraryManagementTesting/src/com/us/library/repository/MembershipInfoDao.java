package com.us.library.repository;

import java.util.List;

import com.us.library.model.MembershipInfo;

public interface MembershipInfoDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final MembershipInfo membershipinfo) throws Exception;
	public boolean update(final MembershipInfo membershipinfo) throws Exception;
	public boolean delete(final MembershipInfo membershipinfo) throws Exception;
	public MembershipInfo find(int id) throws Exception;
	public List<MembershipInfo> findAll() throws Exception;
}
