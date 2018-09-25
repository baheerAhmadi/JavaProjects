package com.practise.collections.set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSettImpl {

	static public void  main(String args[]){
	Set <String> ar=new HashSet<String>();
	
	//Goni sanchilo objects vestunna okati tarvata okati
	ar.add("Shiva");
	ar.add("Anand");
	//danini read cheyadaniki for loop wadtha
	System.out.println("op from regular for loop start");
	
	System.out.println("op from regular for loop end");
	System.out.println("op from shorthand forloop");
	for(String str:  ar){
		
		System.out.println(str);
	}
	System.out.println("op from shorthand forloop end");
	//read chesina tarvata kuda goni sanchilo objects alaney untayi
	System.out.println("after reading the data the colection  doesnt loose its objects");
	System.out.println(ar);
	
	System.out.println("\n\n\n /*********************************************    addAll         *******************************************************/");
	List<String> str=new ArrayList<String>();
	str.add("Vasu");
	str.add("suman");
	str.add("");
	Integer i=1000;
	double iI;
	
	str.add("suman");
	str.add("Shiva");
	//ar.clear();
	
	ar.addAll(str);
	
	for(String iter: ar)
	{
		System.out.println(iter);

	}
}}