package Arrays;

public class Twodimension {

	public static void main(String[] args) {
		int [][]numbers=new int [3][4];
		System.out.println("number.length");
		System.out.println("number[0].length");
		System.out.println("number[1].length");
		System.out.println("number[2].length");
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=30;
		
		numbers[1][0]=40;
		numbers[1][1]=50;
		numbers[1][2]=60;
		numbers[1][3]=60;
		
		for(int[]n1:numbers) {
			for(int n:n1) {
				System.out.println(n+" ");
				System.out.println();
			}
		}
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[1].length;j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		
		
	}

}
