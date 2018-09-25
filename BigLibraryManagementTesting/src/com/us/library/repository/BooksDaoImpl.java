package com.us.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.us.library.model.Books;
import com.us.library.model.BooksCategory;
@Repository
public class BooksDaoImpl implements BooksDao {

	@Autowired
	HibernateTemplate ht;
	@Override
	public int save(Books books) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(books);
	}

	@Override
	public boolean update(Books books) throws Exception {
		// TODO Auto-generated method stub
		ht.update(books);
		return true;
	}

	@Override
	public boolean delete(Books books) throws Exception {
		// TODO Auto-generated method stub
		ht.delete(books);
		return true;

	}

	@Override
	public Books find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (Books)ht.get(Books.class, id);
	}

	@Override
	public List<Books> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Books> bookscategory= ht.find("from books");
		return bookscategory;
	}

}