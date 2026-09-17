package javaconstructors;

import java.util.Scanner;

public class LoanInterest {

double  CalculateInterest(double principal, double rate , int time) {	
	return (principal*rate*time)/100;
}
    void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principal amount:");
	double principal = sc.nextDouble();
	
	System.out.println("Enter rate of Interest:");
	double rate = sc.nextDouble();
	
	System.out.println("Enter time(in years): ");
	int time  = sc.nextInt();
	
	double interest = CalculateInterest(principal,rate,time);
	System.out.println("simple Interest = " +interest);
	
	
}

	

	}

