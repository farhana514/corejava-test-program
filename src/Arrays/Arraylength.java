package Arrays;
import java.util.Arrays;
public class Arraylength {

	public static void main(String[] args) {
		int[]a1= {3,4,5};
		int[]a2= {6,7,8};
		int len=0;
		if(a1.length>a2.length) {
			len=a1.length;
		}else {
			len=a1.length;
		}
		int[]le=new int [len];
		for(int i=0;i<len;i++) {
			if(a1.length <=i) {
				le[i] = a2[i];
			}else if (a2.length<=i) {
				le[i]=a1[i];
			}else {
				le[i]=a1[i]+a2[i];
				
			}
		}
		
		
		System.out.println(java.util.Arrays.toString(le));
		
	}
}
	


