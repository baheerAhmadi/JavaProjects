package com.practise.collections.list.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWithStudentObj {
public static void main(String args[])
{
	Student s=new Student("shiva", "adari", "Florida", 151);
	Student s1=new Student("shiva anand", "adari", "Florida", 152);
	Student s3=new Student("anand", "adari", "Florida", 153);
	Student s4=new Student("nandu", "dari", "FL", 154);
	LinkedList<Student> list=new LinkedList<Student>();
	
	list.add(s);
	list.add(s1);
	list.addFirst(s1);
	boolean a=list.isEmpty();
	list.add(2, s3);
	list.addLast(s4);
	while(list.contains(s1)){
	list.remove(s1);
	}
System.out.println("is the Linked List is Empty:"+a);
int siz=list.size();
System.out.println("the size of the linkedlist is:"+siz);
System.out.println("getting the student firstname at the index of 2:"+list.get(2).getStufname());

System.out.println("Does the object s1 consist in the list?:"+list.contains(s1));
	for(Student stu:list)
	{
		System.out.println(stu.getRollno()+","+stu.getState()+","+stu.getStufname()+","+stu.getStulname()+"");
	}

}
}
/*
void add(int index, Object element)	It is used to insert the specified element at the specified position index in a list.
void addFirst(Object o)	It is used to insert the given element at the beginning of a list.
void addLast(Object o)	It is used to append the given element to the end of a list.
int size()	It is used to return the number of elements in a list
boolean add(Object o)	It is used to append the specified element to the end of a list.
boolean contains(Object o)	It is used to return true if the list contains a specified element.
boolean remove(Object o)	It is used to remove the first occurence of the specified element in a list.
Object getFirst()	It is used to return the first element in a list.
Object getLast()	It is used to return the last element in a list.
int indexOf(Object o)	It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list does not contain any element.
int lastIndexOf(Object o)	It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list does not contain any element.
*/