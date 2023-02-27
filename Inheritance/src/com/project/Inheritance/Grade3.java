package com.project.Inheritance;

public class Grade3 extends Teacher {
	int rollnumber=4;
	String sname="ccccc";
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
	}
	public void Studentdetails() {
		System.out.println("Grdae 3 Student details   :");
		System.out.println("name of the student  :"+sname);
		System.out.println("Rollnumber of the student  :"+rollnumber);
		System.out.println("************************************");
	}
}
