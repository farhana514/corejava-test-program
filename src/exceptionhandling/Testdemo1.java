package exceptionhandling;

import java.util.Scanner;

public class Testdemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("enter a number");
		int n1 = sc.nextInt();
		
		System.out.println("enter another number:");
		int n2= sc.nextInt();
	//no exception of type object can be thrown;
		// an exception type must be a subclass of throwable
		
			System.out.println("in try !!");
		System.out.println(n1/n2);
		}catch( ArithmeticException e   ) {
			
			System.out.println("in catch !!");
			e.printStackTrace();
		}
		
		
		
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");
		
	}
	}


