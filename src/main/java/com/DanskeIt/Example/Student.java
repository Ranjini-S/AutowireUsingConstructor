package com.DanskeIt.Example;

public class Student {
public String name;
public String id;
public Hostel hostel;
 
 

public Student(String name, String id, Hostel hostel) {
	super();
	this.name = name;
	this.id = id;
	this.hostel = hostel;
	System.out.println("I am in student");
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public Hostel getHostel() {
	return hostel;
}



public void setHostel(Hostel hostel) {
	this.hostel = hostel;
}



@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", hostel=" + hostel + "]";
}

}
