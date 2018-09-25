package com.practise.collection.mix;

import java.util.ArrayList;
import java.util.List;

public class HashMapArray {
public static void main(String [] args)
{
	
	        Student alex = new Student(1, "Alex");
	        Student alex1 = new Student(1, "Alex");
	        List < Student > studentsLst = new ArrayList < Student > ();
	        studentsLst.add(alex);
	        System.out.println("Arraylist size = " + studentsLst.size());
	        System.out.println("Arraylist contains Alex = " + studentsLst.contains(alex1));
	       System.out.println("Alex hashCode:"+ alex.hashCode()+"Alex1 hashCode()"+alex1.hashCode());
	        /* Op:
	        Arraylist size = 1
	        Arraylist contains Alex = true
	        */
	    }
	}
