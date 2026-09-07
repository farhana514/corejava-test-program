package Loops;
import java.util.Scanner;
public class Forloopfactorials {

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number:");
		 int n = sc.nextInt();
		 int n1 = findfactorial(n);
		 System.out.println("factorial of given number is:"+n1);
		 sc.close();
	 }
	//upto 33-->int
	 //34-65-->long
	 int findfactorial(int n) {
		 int fact=1;
		 for(int i =n;i>=1;i--) {
			 fact = i*fact;
		 }
			 return fact;
		 }
	 }


