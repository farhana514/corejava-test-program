package Loops;
import java.util.Scanner;
public class ForloopFactors {
	
	static void findfactor(int n) {
		for(int i =1;i<=n;i++) {
			if (n%i==0) {
				System.out.println(i+ " ");
			}
		}
	}

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter a number to find factor:");
		 int n = sc.nextInt();
		 findfactor(n);
		 sc.close();
		 
	
			
		}

	}


