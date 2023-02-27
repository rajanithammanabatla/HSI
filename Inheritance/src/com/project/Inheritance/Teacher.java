package com.project.Inheritance;

public class Teacher extends School {
	String Tname="eeeee";
	String Qualification="abc";
	double sal=3000;
	public void schooldetails() {
		System.out.println("details about the school");
		System.out.println("School registration number   :"+registration);
		System.out.println("Name of the school   :"+name);
		System.out.println("Location of the school  :"+Location);
	}
	public void teacherdetails() {
		
		System.out.println("details about teacher");
		System.out.println("name of the teacher   :"+Tname);
		System.out.println("qualification of the teacher  :"+Qualification);
		System.out.println("salary of the teacher  :"+sal);
		System.out.println("************************************");
	}

}
