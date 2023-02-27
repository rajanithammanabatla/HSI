package com.Project.DecisionStatement;

public class NestedIf {
public static void main(String[] args) {
	String Accountname="Rajani";
	String Location="Hyderabad";
	String Accountnumber="324345";
	String Accountstatus="Active";
	if (Accountname.equals("Rajani")) {
		if(Location.equals("Hyderabad")) {
			if(Accountnumber.equals("12345")) {
				if(Accountstatus.equals("Active")) {
					System.out.println("Account is found and is active");
				}
				else {
					System.out.println("Account not active");
				}
			}
				else {
					System.out.println("Account number not matching");
				}
		}
				else {
					System.out.println("Location is not matching");
				}
	}
			else {
				System.out.println("Account name not matching");
				}
			}
	    
	}
	


