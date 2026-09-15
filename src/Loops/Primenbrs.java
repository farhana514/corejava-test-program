package Loops;

import java.util.Scanner;

public class Primenbrs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("up to where you want to print..?");
int n =sc.nextInt();
	for(int i=0;i<n;i++) {
		if(isprime(i)) {
			System.out.println(i+" ");
			sc.close();
		}
	}
	
	}
	static boolean isprime(int n) {
		boolean status = true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status = false;
				break;
			}
		}
		return status;
	}

	}


