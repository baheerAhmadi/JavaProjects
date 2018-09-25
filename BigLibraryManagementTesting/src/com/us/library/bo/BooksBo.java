package com.us.library.bo;

import java.util.List;

import com.us.library.model.Books;
import com.us.library.model.User;

public interface BooksBo {

	public int createBooks(Books	books) throws Exception;
	public boolean updateBooks(Books books)throws Exception;
	public boolean deleteBooks(Books books)throws Exception;
	public Books selectBooks(int id)throws Exception;
	public List<Books> selectAllBooks()throws Exception;
	
}
