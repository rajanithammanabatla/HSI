package com.Project.DecisionStatement;

public class Switch1 {
	public static void main(String[] args) {
	      String Enternumber = "1";
		    switch (Enternumber) {
	            case "1":
		        System.out.println("Do You want to deposit money?");
		        break;
	 	        case "2":
	 	        System.out.println("Do You want to withdraw money?");
		        break;
		      	case "3":
		      	System.out.println("Do You want new account?");
		        break;
		        case "4":
		        System.out.println("Do you want to raise the complaint?");
		        break;
	 	        default:
	 	        System.out.println("Invalid input");
		        break;
		    }
		  }
		}