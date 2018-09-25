package com.practise.collections.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

	static public void  main(String args[]){
	ArrayList <String> ar=new ArrayList<String>();
	
	//Goni sanchilo objects vestunna okati tarvata okati
	ar.add("Shiva");
	ar.add("Anand");
	//danini read cheyadaniki for loop wadtha
	System.out.println("op from regular for loop start");
	for(int i=0;i<ar.size();i++){

		System.out.println(ar.get(i));
	}
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