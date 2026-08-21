package Tasks;


public class ArrayLargestElement {

	public static void main(String[] args) {
		int[]a= {12,45,7,89,23};
		int largest = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest = a[i];
			
			}
		}
		System.out.println("largest ="+ largest);
	}
}
		
	


