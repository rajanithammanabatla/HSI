package com.project.AbstractConcept;

public class Tester {
	public static void main(String[] args) {
		Commercial c=new Commercial();
		System.out.println("Commercial Calculation");
		c.getrate();
		c.calculate(200);
		Domestic d=new Domestic();
		System.out.println("Domestic Calculation");
		d.getrate();
		d.calculate(300);
		
	}

}
