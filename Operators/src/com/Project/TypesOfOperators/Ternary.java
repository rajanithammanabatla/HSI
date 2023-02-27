package com.Project.TypesOfOperators;

public class Ternary {
	public static void main(String[] args) {
		int x=20; 
		int z=70;
		int y=50;
		int comparison;
		comparison = (x == 1) ? 61: 90;  
		System.out.println("Value of y is: " +  comparison);  
		comparison = (x == 20) ? 61: 90;  
		System.out.println("Value of y is: " + comparison); 
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
		System.out.println("The largest numbers is:  "+largestNumber);
	}
	}