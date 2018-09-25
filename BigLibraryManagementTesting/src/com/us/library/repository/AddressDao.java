package com.us.library.repository;

import java.util.List;

import com.us.library.model.Address;

public interface AddressDao {
	// here we are using final keyword to update what ever the data we are passing we cannot make any modification
	public int save(final Address address) throws Exception;
	public boolean update(final Address address) throws Exception;
	public boolean delete(final Address address) throws Exception;
	public Address find(int id) throws Exception;
	public List<Address> findAll() throws Exception;
}
