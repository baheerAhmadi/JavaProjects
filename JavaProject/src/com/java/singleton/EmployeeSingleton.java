package com.java.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;


public final class EmployeeSingleton {
	
	private static Integer eid=0;
	private static String name=null;
	private final Address address;//. Addres {line1,line 2}
	private final String dateofjoining;
	public Integer getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public String getDateofjoining() {
		return dateofjoining;
	}
	public EmployeeSingleton(Integer eid, String name, String date) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = new Address();
		this.dateofjoining = date;
	}
	
	public static void main(String args[])
	{
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());

		EmployeeSingleton es=new EmployeeSingleton(565, "Shiva", date);
		System.out.println(eid+"  "+name+"  "+date);
	}
	
/*	Make the Java Class Final. *********** Child class cannot be created as we can set from child class***************

	Make The Intance variable as Private final. 

	Instance Variables and Data Members are same.

	Removing all the setter and keeping only getters. 

	final class student{
	private final Integer id;
	private final Integer rollno;
	private final String name;
	private final Address address;

	student(Integer id,Integer rollno, String name, Address address){
	this.address = new Address(address.addressLine1());************We are writing new object bcs Address is a mutable class ************

	}
	}

	Task1:
	Employee make it as Immutable

	Data Members:
	eid,
	name, strng
	address. Addres {line1,line 2}
	dateofjoining. Date
*/
}
