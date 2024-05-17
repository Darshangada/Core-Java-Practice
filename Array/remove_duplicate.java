package Array;

import java.util.Arrays;

public class remove_duplicate {

	public static void main(String[] args) {
		int arr[]= {12,43,54,23,1,35,34,65,23,43,12,2,2};
		
		int count=0;
		int arr2[]= {};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr2[count]=arr[i];
				count++;
			}
			
		}
		
		arr2[count]=arr[arr.length-1];
		count++;
		for(int i=0;i<count;i++) {
			arr[i]=arr2[i];
		}
		System.out.println(count); 
		
	}
}
