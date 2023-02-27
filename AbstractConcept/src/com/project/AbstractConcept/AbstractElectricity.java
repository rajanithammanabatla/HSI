package com.project.AbstractConcept;

public abstract class AbstractElectricity {
	double rate;
	
	public void description() {
		System.out.println("Detailed calculation of electricity");
	}
public abstract void getrate();
public void calculate(int units) {
	System.out.print("bill amount for " + units + " units ");
	System.out.println(rate*units);
}
}
