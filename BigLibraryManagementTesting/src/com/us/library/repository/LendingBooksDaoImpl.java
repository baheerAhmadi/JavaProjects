package com.us.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.model.LendingBooks;
@Repository
public class LendingBooksDaoImpl implements LendingBooksDao {

	@Autowired
	HibernateTemplate ht;
	@Override
	public int save(LendingBooks lendingbooks) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(lendingbooks);
	}

	@Override
	public boolean update(LendingBooks lendingbooks) throws Exception {
		// TODO Auto-generated method stub
		ht.update(lendingbooks);
		return true;
	}

	@Override
	public boolean delete(LendingBooks lendingbooks) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(lendingbooks);
		return true;
	}

	@Override
	public LendingBooks find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (LendingBooks)ht.get(LendingBooks.class, id);
	}

	@Override
	public List<LendingBooks> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<LendingBooks> lendingbooks= ht.find("from lendingbooks");
		return lendingbooks;
	}

}




