package com.project.TypesOfVariable;

public class Parameters {
	public void demo(int a,int b) {
		
		int sum=a+b;
		System.out.println("Addition of two numbers :"+sum);
		int sub=a-b;
		System.out.println("Substraction of two numbers :"+sub);
		
	}
	public static void demo1(int a,int b) {
		
		int mul=a*b;
		System.out.println("Multiplication of two numbers :"+mul);
		int div=a/b;
		System.out.println("Division of two numbers :"+div);
		
	}
public static void main(String[] args) {
	Parameters param=new Parameters();
	param.demo(20, 10);
	Parameters.demo1(40, 20);
	
}
}
