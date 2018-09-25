package com.us.library.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.main.Test;
import com.us.library.model.Address;

@Repository
public class AddressDaoImpl implements AddressDao {

	/*Session session = Test.getConnection().openSession();
    Transaction tx = session.beginTransaction();
	*/
	@Autowired
	private HibernateTemplate ht;
	@Override
	public int save(Address address) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(address);
	}

	@Override
	public boolean update(Address address) throws Exception {
		// TODO Auto-generated method stub
		ht.update(address);
		return true;
	}

	@Override
	public boolean delete(Address address) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(address);
		return true;
	}

	@Override
	public Address find(int id) throws Exception {
		/*try {
	         tx = session.beginTransaction();
	         List addresslist = session.createQuery("FROM Address").list(); 
	         for (Iterator iterator = addresslist.iterator(); iterator.hasNext();){
	        	 Address adrs = (Address) iterator.next(); 
	            System.out.print("First Name: " + adrs.getFirstName()); 
	            System.out.print("  Last Name: " + adrs.getLastName()); 
	            System.out.println("  Salary: " + adrs.getSalary()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }*/
		
		return (Address)ht.get(Address.class, id);

	}

	@Override
	public List<Address> findAll() throws Exception {
		/*List<Address> addresslist = null;
		try {
	         tx = session.beginTransaction();
			 addresslist = session.createQuery("FROM Address").list(); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
		return addresslist;*/
		List<Address> address= ht.find("from libraryuseraddress");
		return address;

	}

}
