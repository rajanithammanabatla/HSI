package com.project.TypesOfVariable;

public class InstanceVariables {
	 int a=30;
	 int b=20;
	 int sum=a+b;
	 int sub=a-b;
	 int mul;
	 int div;
	 
	 public void demo() {
		 System.out.println("Demo of instance variables");
	 }
	 public static void main(String[] args) {
		 InstanceVariables instance= new InstanceVariables();
		 instance.demo();
		 instance.mul=instance.a*instance.b;
		 instance.div=instance.a/instance.b;
		 System.out.println("Addition of two number :"+instance.sum);
		 System.out.println("Substraction of two number :"+instance.sub);
		 System.out.println("Multiplication of two number :"+instance.mul);
		 System.out.println("Division of two number :"+instance.div);
		 
	 }
	}