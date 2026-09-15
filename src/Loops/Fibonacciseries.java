package Loops;
import java.util.Scanner;
public class Fibonacciseries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("how many times you want to print");
		int n = sc.nextInt();
		fibonacciseries(n);
		sc.close();
	}

	static void fibonacciseries(int n) {
		int n1=0;
		int n2=1;
		System.out.println(n1+ " "+n2+ " ");
		int n3=0;
		for (int i=0;i<=n-2;i++) {
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;   
			
		}
		
	}

	}


