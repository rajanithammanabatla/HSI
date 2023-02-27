package com.project.Encapsulation;

public class Tester {
public static void main(String[] args) {
	Teacher T=new Teacher();
	T.setid(11);
	T.setname("rrrr");
	T.setadd("aaaaa");
	T.setsal(5000);
	System.out.println("Teacher details");
	System.out.println("Teacher id   :"+T.getid());
	System.out.println("Teacher name   :"+T.getname());
	System.out.println("Teacher address   :"+T.getadd());
	System.out.println("Teacher sal   :"+T.getsal());
	System.out.println("*******************************");
	Student S=new Student();
	S.setid(22);
	S.setname("ddddddd");
	S.setadd("cccccccc");
	S.setmarks(50);
	System.out.println("Student details");
	System.out.println("Student id   :"+S.getid());
	System.out.println("Student name   :"+S.getname());
	System.out.println("Student address   :"+S.getadd());
	System.out.println("Student sal   :"+S.getmarks());
}
}
