package com.practise.collections.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

import com.practise.collections.list.LinkedList.Student;

public class ArrayListWithStudentObj {
public static void main(String args[])
{
	Student s=new Student("shiva", "adari", "Florida", 151);
	Student s1=new Student("shiva anand", "adari", "Florida", 152);
	List<Student> list=new ArrayList<Student>();
	list.add(s);
	list.add(s1);
	for(Student stu:list)
	{
		System.out.println(stu.getRollno()+","+stu.getState()+","+stu.getStufname()+","+stu.getStulname()+"");
	}

}
}
