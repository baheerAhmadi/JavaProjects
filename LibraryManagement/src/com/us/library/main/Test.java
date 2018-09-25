package com.us.library.main;

import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.buildSessionFactory();
	/*Session session=factory.openSession();
	
	//Transaction t=session.beginTransaction();
	
	Employee e1=new Employee();
	//e1.setId(1001);
	e1.setFirstName("sonoo");
	e1.setLastName("jaiswal");
	
	//Employee e2=new Employee();
//	e2.setId(1002);
	e2.setFirstName("vimal");
	e2.setLastName("jaiswal");
	e2.setDob(new Date());
	
	//session.save(e1);
	MembershipInfo m=new MembershipInfo();
	User u=new User();
	Address a=new Address();
	BooksCategory bc=new BooksCategory();
	LendingBooks  L=new LendingBooks();
	
	UserInfo ui=new UserInfo();
	UserType ut=new UserType();
	Books bk=new Books();
	

	session.save(a);
	session.save(u);
	session.save(bc);
	session.save(L);
	session.save(m);
	session.save(ui);
	session.save(ut);
	session.save(bk);	

	t.commit();
	session.close();
	factory.close();
	
	Session session1=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	Transaction t2=session1.beginTransaction();
	Employee e11=(Employee) session1.get(Employee.class, 2);
	System.out.println(e11.getDob());
	t2.commit();
	session.close();
	factory.close();
	System.out.println("successfully saved");
*/System.out.println("successfully saved");
}
}