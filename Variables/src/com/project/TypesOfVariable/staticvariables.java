package com.project.TypesOfVariable;

public class staticvariables {
 static int a=30;
 static int b=20;
 static int sum;
 static int sub;
 static int mul=a*b;
 static int div=a/b;
 
 public static void demo() {
	 System.out.println("Demo of static variables");
 }
 public static void main(String[] args) {
	 staticvariables.demo();
	 staticvariables.sum=staticvariables.a+staticvariables.b;
	 staticvariables.sub=staticvariables.a-staticvariables.b;
	 System.out.println("Addition of two numbers :"+staticvariables.sum);
	 System.out.println("Substraction of two numbers :"+staticvariables.sub);
	 System.out.println("Multiplication of two numbers :"+staticvariables.mul);
	 System.out.println("Division of two numbers :"+staticvariables.div);
	 
 }
}
