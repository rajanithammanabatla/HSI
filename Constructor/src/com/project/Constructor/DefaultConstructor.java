package com.project.Constructor;

public class DefaultConstructor {
int empid;
String empname;
double salary;
public DefaultConstructor() {
	System.out.println("This is the Default Constructor");
}
public DefaultConstructor(int empid ) {
	System.out.println("This is the Default Constructor with sing parameter");
	this.empid=empid;
}
public DefaultConstructor(int empid,String empname ) {
	System.out.println("This is the Default Constructor with two parameters");
	this.empid=empid;
	this.empname=empname;
}
public DefaultConstructor(int empid,String empname,double salary) {
	System.out.println("This is the Default Constructor with two parameters");
	this.empid=empid;
	this.empname=empname;
	this.salary=salary;
}
}
