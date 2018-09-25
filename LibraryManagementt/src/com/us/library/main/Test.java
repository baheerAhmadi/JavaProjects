package com.us.library.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.us.library.model.User;

import oracle.net.TNSAddress.Address;

public class Test {
public static void main(String[] args) throws SecurityException, IllegalStateException {
	Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");  
    SessionFactory sf=cfg.buildSessionFactory();  
    Session session=sf.openSession();  
    Transaction tx=session.beginTransaction();  
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    User e1=new User();  
    e1.setUsename("Ravi Malik");  
    e1.setPaword("ravigmailcom");  
      
    session.persist(e1);  
    tx.commit();  
      
    session.close();  
    System.out.println("success=========" + sf);  
 
}
}