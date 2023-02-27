package com.project.Inheritance;

public class tester {
	public static void main(String[] args) {
		SingleCompany A=new SingleCompany();
		A.documentation();
		A.companydetails();
		System.out.println("*************************************");
		
		SingleEmployee E=new SingleEmployee();
		E.companydetails();
		E.empdetails();
	}

}
