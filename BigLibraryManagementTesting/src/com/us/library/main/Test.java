package com.us.library.main;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.us.library.model.Address;
import com.us.library.repository.AddressDaoImpl;

public class Test {
private static SessionFactory factory1;


static void	doConnection(){
	 try {
	         factory1 = new Configuration().configure().buildSessionFactory();
	         System.out.println("Connected");
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	      }
public static SessionFactory	  getConnection(){
		  //SessionFactory factory1;
		return factory1;}
public static void addUser(){
	
	
	Address a=new Address("13233 Sanctuary Cove Dr","Apt 310","temple terrace","FL",33637,"USA",110,new Date());
	Session session=getConnection().openSession();
	//creating transaction object
	Transaction trans=session.beginTransaction();
	
	Serializable s=session.save(a);
	System.out.println(s);
	trans.commit();
	session.close();
	}
public static void showUser()
{
	AddressDaoImpl adi=new AddressDaoImpl();
	List<Address> adrslist;
	try {
		adrslist = adi.findAll();
	
	for(Address adr:adrslist)
	{
		System.out.print(adr.getAddress_id()+" ");
		System.out.print(adr.getLine1()+" ");
		System.out.print(adr.getLine2()+" ");
		System.out.print(adr.getCity()+" ");
		System.out.print(adr.getState()+" ");
		System.out.print(adr.getCity()+" ");
		System.out.print(adr.getZipcode()+" ");
		System.out.print(adr.getCountry()+" ");
		System.out.println(adr.getUpdatedon());
	}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void main(String[] args) throws Exception {
	Test t=new Test();
	doConnection();
//	addUser();
	showUser();
}}
