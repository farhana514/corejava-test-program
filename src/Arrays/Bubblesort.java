package Arrays;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int [] arr = {31,54,93,75,8,15,2};
		int temp=0;
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(arr));
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			for (int j=0;j<arr.length-1-i;j++) {
			 
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag = true;	
			}
			count1++;
		}
		count++;
		if(!flag) {
			break;
		}
		}
		System.out.println("count:"+count);
		System.out.println("count:"+count1);
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(arr));
	}
}
