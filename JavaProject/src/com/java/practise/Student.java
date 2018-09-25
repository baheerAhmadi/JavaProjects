package com.java.practise;
class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public int hashCode() {
	return 1;
}
@Override
public boolean equals(Object obj) {
	return true;
	}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}  
}