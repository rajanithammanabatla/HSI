package com.Project.DecisionStatement;

public class IfelseLadder1 {
	public static void main(String[] args) {
		int marks = 20;
		if (marks >= 35) {
			System.out.println("Pass");
			      if(marks>35 && marks<=50){
				  System.out.println("D Grade");
      } 
		         else if (marks>50 && marks<=60){
			     System.out.println("C Grade");
      } 
		        else if (marks>60 && marks<=70) {
			    System.out.println("B Grade");
      } 
		else if (marks>70 && marks<=100) {
			System.out.println("A Grade");
      } 
						
	  }
		else {
			System.out.println("Fail");
	  }
	}
}
