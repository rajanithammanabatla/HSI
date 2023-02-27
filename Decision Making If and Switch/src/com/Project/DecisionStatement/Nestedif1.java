package com.Project.DecisionStatement;

public class Nestedif1 {
	public static void main(String[] args) {
		String positionname="developer";
		String Location="Hyderabad";
		int experiance=3;
		String positionstatus="Active";
		if (positionname.equals("developer")) {
			if(Location.equals("Hyderabad")) {
				if(experiance>=3) {
					if(positionstatus.equals("Active")) {
						System.out.println("You are applying for developer position");
					}
					else {
						System.out.println("Developer position is present not available");
					}
				}
					else {
						System.out.println("experiance is less than 3");
					}
			}
					else {
						System.out.println("Location is not matching");
					}
		}
				else {
					System.out.println("Position name is not matching");
					}
				}
		    
		}
		

