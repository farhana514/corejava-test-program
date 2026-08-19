package Arrays;
import java.util.Scanner;

public class AvailableOrnot {

	public static void main(String[] args) {
		int[]arr= {18,7,4,5,1,10,33,9,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to seacrh: ");
		int search = sc.nextInt();
		boolean status=false;
		for(int a: arr) {
			if(a==search) {
				System.out.println("the element is found :"+a);
				status=true;
				break;
			}
		}
		if (status) {
			System.out.println("the element not found:"+search);
				
		}
		
	}

}
