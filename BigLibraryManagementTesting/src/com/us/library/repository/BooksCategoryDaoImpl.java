package com.us.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.model.Address;
import com.us.library.model.BooksCategory;

@Repository
public class BooksCategoryDaoImpl implements BooksCategoryDao {

	@Autowired
	HibernateTemplate ht;
	
	@Override
	public int save(BooksCategory bookscategory) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(bookscategory);
	}

	@Override
	public boolean update(BooksCategory bookscategory) throws Exception {
		// TODO Auto-generated method stub
		ht.update(bookscategory);
		return true;
	}

	@Override
	public boolean delete(BooksCategory bookscategory) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(bookscategory);
		return true;
	}

	@Override
	public BooksCategory find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (BooksCategory)ht.get(BooksCategory.class, id);
	}


	@Override
	public List<BooksCategory> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<BooksCategory> bookscategory= ht.find("from bookscategory");
		return bookscategory;
	}

}
