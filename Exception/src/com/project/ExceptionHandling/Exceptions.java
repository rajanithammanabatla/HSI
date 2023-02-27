package com.project.ExceptionHandling;

public class Exceptions {
	public static void main(String[] args) {
		try {
			System.out.println("We are opening the files");
			int n=0;
			System.out.println("n :="+n);
			int a=45/n;
			System.out.println("a :="+a);
			int b[]= {10,20,30};
			b[50]=100;
			for(int c:b) {
				System.out.print(" "+c);
			}
			
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
			
		}
		
		finally {
			System.out.println("  Closing the files");
		}
	}

}
