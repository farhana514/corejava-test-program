package Loops;
import java.util.Scanner;
//given number perfect are not 
//input is number=6
//perfect = sum of its factor = given number
//output should be = true 
public class Foorloopperfectnot {
	

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.close();
		
		boolean status = isperfect(n1);
		if (status){
		System.out.println("the given nubmber is perfect");
		}else {
			System.out.println(" the given number is not perfect");
			System.out.println("main method ended");
		}
	}
			boolean isperfect(int n1) {
				boolean flag = false;
				int sum = 0;
				for (int i=1;i<n1/2;i++) {
					if(n1% i==0) {
						sum=sum+i;
						
					}
				}
					if(sum==n1) {
						flag=true;
						
					}
					return flag;
			}
					
					
				
				
		
			
		}
			
			
			
		
			
		
 
	


