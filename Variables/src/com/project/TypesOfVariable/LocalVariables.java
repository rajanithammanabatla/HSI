package com.project.TypesOfVariable;

public class LocalVariables {
	public void demo() {
		int a=60;
		int b=20;
		int sum=a+b;
		System.out.println("Addition of two numbers :"+sum);
		int sub=a-b;
		System.out.println("Substraction of two numbers :"+sub);
		
	}
	public static void demo1() {
		int a=60;
		int b=20;
		int mul=a*b;
		System.out.println("Multiplication of two numbers :"+mul);
		int div=a/b;
		System.out.println("Division of two numbers :"+div);
		
	}
public static void main(String[] args) {
	LocalVariables local=new LocalVariables();
	local.demo();
	LocalVariables.demo1();
	
}
}
