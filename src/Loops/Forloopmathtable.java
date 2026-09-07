package Loops;
import java.util.Scanner;
public class Forloopmathtable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number for which table you want to proceed:" );
		int n = sc.nextInt();
		
		
		System.out.println("how many times you want to print...?:");
		int n1 = sc.nextInt();
		
		for (int i=1;i<=n1;i++) {
			System.out.println(n+"x "+ i+"="+(n*i) );
			sc.close();
		}

	}

}
