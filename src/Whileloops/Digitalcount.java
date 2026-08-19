package Whileloops;
import java.util.Scanner;
public class Digitalcount {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a nbr :");
		int n=sc.nextInt();
		int count = 0;
		while (n>0) {
			n=n/10;
			count++;
		}
		System.out.println("the count is:"+count);
	}
	
}
