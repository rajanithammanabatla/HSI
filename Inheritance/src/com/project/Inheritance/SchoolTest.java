package com.project.Inheritance;

public class SchoolTest {
	public static void main(String[] args) {
		School sch=new School();
		sch.schooldetails();
		Teacher T=new Teacher();
		System.out.println("************************************");
		T.schooldetails();
		System.out.println();
		T.teacherdetails();
		System.out.println("*****************************************");
		Grade1 G1=new Grade1();
		G1.schooldetails();
		System.out.println();
		G1.teacherdetails();
		System.out.println();
		G1.Studentdetails();
		System.out.println("*********************************************");
		Grade2 G2=new Grade2();
		G2.schooldetails();
		System.out.println();
		G2.teacherdetails();
		System.out.println();
		G2.Studentdetails();
		System.out.println("*********************************************");
		Grade3 G3=new Grade3();
		G3.schooldetails();
		System.out.println();
		G3.teacherdetails();
		System.out.println();
		G3.Studentdetails();
	}
}
