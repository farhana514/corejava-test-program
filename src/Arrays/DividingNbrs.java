package Arrays;

import java.util.Scanner;

public class DividingNbrs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array:");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		System.out.println("enter "+n+" numbers:");
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			
		}
		int positivecount = 0;
		int negitivecount = 0;
		int zerocount=0;
		
		for (int i=0;i<n;i++) {
			if(a[i]>0) {
				positivecount++;
			}else if (a[i]<0) {
				negitivecount++;
			}else {
				zerocount++;
				
			}
			
		}
		int []positive = new int [positivecount];
		int []negitive = new int [negitivecount];
		int[]zero=new int [zerocount];
		
		int p=0,ne =0,z=0;
		for(int i =0;i<n;i++) {
			if(a[i]>0) {
				positive[p++]= a[i];
			}else if (a[i]<0) {
				negitive[ne++]=a[i];
			}else {
				zero[z++]= a[i]
;
				}
		}
		System.out.println("positive number :");
		for(int x : positive) {
			System.out.println(x+" ");
		
		}
		System.out.println("\n negitive number :");
		for(int x :negitive  ) {
			System.out.println(x+" ");
		}
			
			System.out.println("\n zero:");
			for(int x : positive) {
				System.out.println(x+" ");
	}
			sc.close();
		}
}


