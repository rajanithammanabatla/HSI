package com.project.Polymorphism;

public class CompiletimePolymorphism {
	public void add(int a,int b) {
		System.out.println("Addition of two numbers  :"+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Addition of three numbers  :"+(a+b+c));
	}
	public void add(int a,double b) {
		System.out.println("Addition of two numbers  :"+(a+b));
	}
	public void add(int a,float b,double c) {
		System.out.println("Addition of three numbers  :"+(a+b+c));
	}
	public static void main(String[] args) {
		CompiletimePolymorphism s=new CompiletimePolymorphism();
		s.add(10, 15);
		s.add(10, 15, 20);
		s.add(10, 15.5);
		s.add(10, 15.5f, 20.5);
	}
}
