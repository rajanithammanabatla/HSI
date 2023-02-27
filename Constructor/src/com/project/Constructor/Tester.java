package com.project.Constructor;

public class Tester {
	public static void main(String[] args) {
		DefaultConstructor def=new DefaultConstructor();
		def.empid=123;
		def.empname="rajani";
		def.salary=1000;
		System.out.println("employee id is :"+def.empid);
		System.out.println("employee name is :"+def.empname);
		System.out.println("employee salary is :"+def.salary);
		System.out.println("**************************************");
		DefaultConstructor def1=new DefaultConstructor(150);
		def1.empname="sravani";
		def1.salary=5000;
		System.out.println("employee id is :"+def1.empid);
		System.out.println("employee name is :"+def1.empname);
		System.out.println("employee salary is :"+def1.salary);
		System.out.println("**************************************");
		DefaultConstructor def2=new DefaultConstructor(200, "sharath");
		def2.salary=5000;
		System.out.println("employee id is :"+def2.empid);
		System.out.println("employee name is :"+def2.empname);
		System.out.println("employee salary is :"+def2.salary);
		System.out.println("**************************************");
		DefaultConstructor def3=new DefaultConstructor(250, "dharani", 7000);
		System.out.println("employee id is :"+def3.empid);
		System.out.println("employee name is :"+def3.empname);
		System.out.println("employee salary is :"+def3.salary);
		System.out.println("**************************************");
	}

}
