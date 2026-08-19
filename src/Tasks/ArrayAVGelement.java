package Tasks;

import java.util.Scanner;

public class ArrayAVGelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[4];
		int sum =0;
		System.out.println("enter 4 elements:");
		
	
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum = sum +a[i];
	}
		double average = (double)sum/a.length;
		System.out.println("Average = " +average);
	}
}
		
		
				
						
		


