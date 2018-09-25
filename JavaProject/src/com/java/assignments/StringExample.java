package com.java.assignments;

public class StringExample {
public static void main(String args[])
{
	String a= new String("Nandu");

	String a22[]= new String[] {"1","2"};
	System.out.println(a);
	System.out.println(a.hashCode());
	a="Reddy";
	System.out.println(a.hashCode());
	System.out.println(a);
	
	String a1=a.concat("hello");
	System.out.println(a1+" "+a1.hashCode());
	
	StringBuffer sb =new StringBuffer("shiva anand");

	System.out.println(sb.hashCode());
	sb.append("shiva");
	System.out.println("sb:"+sb);
	System.out.println(sb.hashCode());
	System.out.println(a22);
	
}
}
