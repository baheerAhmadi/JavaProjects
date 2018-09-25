package com.practise.collections.list.ArrayList;

public class Student {
private String stufname;
private String stulname;
private String state;
private int rollno;
public String getStufname() {
	return stufname;
}
public String getStulname() {
	return stulname;
}
public String getState() {
	return state;
}
public int getRollno() {
	return rollno;
}
public Student(String stufname, String stulname, String state, int rollno) {
	super();
	this.stufname = stufname;
	this.stulname = stulname;
	this.state = state;
	this.rollno = rollno;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + rollno;
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + ((stufname == null) ? 0 : stufname.hashCode());
	result = prime * result + ((stulname == null) ? 0 : stulname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (rollno != other.rollno)
		return false;
	if (state == null) {
		if (other.state != null)
			return false;
	} else if (!state.equals(other.state))
		return false;
	if (stufname == null) {
		if (other.stufname != null)
			return false;
	} else if (!stufname.equals(other.stufname))
		return false;
	if (stulname == null) {
		if (other.stulname != null)
			return false;
	} else if (!stulname.equals(other.stulname))
		return false;
	return true;
}


}
