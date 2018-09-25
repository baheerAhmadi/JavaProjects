package com.java.practise;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
	public static void main(String args[]) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "shiva", 23);
		Student s2 = new Student(102, "mahesh", 21);
		Student s3 = new Student(101, "shiva", 23);
		// creStringating arraylist
		Map<Student, String> map = new HashMap<Student, String>();
		map.put(s1,s1.getName());
		map.put(s2,s2.getName());
		map.put(s3,s3.getName());
		
	System.out.println(s1.hashCode());

	System.out.println(s2.hashCode());

	System.out.println(s3.hashCode());
		System.out.println(map.size());
		System.out.println(map.get(s1));
	}

}
