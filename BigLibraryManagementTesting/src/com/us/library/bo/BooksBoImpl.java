package com.us.library.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.us.library.model.Books;
import com.us.library.model.User;
import com.us.library.repository.BooksDao;

public class BooksBoImpl implements BooksBo {

	@Autowired
	private BooksDao dao;
	@Override
	public int createBooks(Books books) throws Exception {
		return dao.save(books);
	}

	@Override
	public boolean updateBooks(Books books) throws Exception {
		return dao.update(books);
	}

	@Override
	public boolean deleteBooks(Books books) throws Exception {
		return dao.delete(books);
	}

	@Override
	public Books selectBooks(int id) throws Exception {
		return dao.find(id);
	}

	@Override
	public List<Books> selectAllBooks() throws Exception {
		return dao.findAll();
	}

}
