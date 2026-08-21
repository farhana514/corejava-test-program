package Tasks;

public class ArraySmallestElement {

	public static void main(String[] args) {
		int a[]= {12,45,7,89,23};
		int Smallest = a[0];
		
		for(int i=0;i>a.length;i++) {
			if(a[i]>Smallest) {
			Smallest=a[i];
			
			}
		}
			System.out.println("Smallest="+Smallest);
		}

	}
	
	



