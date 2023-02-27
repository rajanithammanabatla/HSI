package com.Project.DecisionStatement;

public class Switch {
	public static void main(String[] args) {
      String AccountStatus = "Editing";
	    switch (AccountStatus) {
            case "Creation":
	        System.out.println("Your account is creating");
	        break;
 	        case "Editing":
 	        System.out.println("Your account is Editing");
	        break;
	      	case "Transfer":
	      	System.out.println("Your account is Transfering");
	        break;
	        case "Deleting":
	        System.out.println("Your account is deleting");
	        break;
 	        default:
 	        System.out.println("Invalid input");
	        break;
	    }
	  }
	}

