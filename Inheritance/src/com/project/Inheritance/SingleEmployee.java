package com.project.Inheritance;

public class SingleEmployee extends SingleCompany {
	String empname="ddddd";
	int empid=2345;
	double empsal=4000;
	public void empdetails() {
		System.out.println("Employee details");
		System.out.println("Employee Name"+empname);
		System.out.println("Employee Id"+empid);
		System.out.println("Employee salary"+empsal);
		
	}
	public void companydetails(){
		System.out.println("Comany Name"+name);
		System.out.println("Comany registration number"+regno);
		System.out.println("Comany Location"+loc);
}
}