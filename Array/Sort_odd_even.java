package Array;

import java.util.Scanner;

public class Sort_odd_even {
	int[]sort(int arr[]) {
		int even[]=new int [arr.length];
		int odd[]=new int [arr.length];
		int oddcount=0;
		int evencount=0;
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				odd[oddcount++]=arr[i];
			}
			else {
				even[evencount++]=arr[i];
			}
			
		}
		System.out.println("Odd array");
		for(int i=0;i<oddcount;i++) {
			for(int j=i+1;j<oddcount;j++) {
				if(odd[i]<odd[j]) {
					int temp=odd[i];
					odd[i]=odd[j];
					odd[j]=temp;
				}
			}
	
		}
		
		System.out.println("even array");
		for(int i=0;i<evencount;i++) {
			for(int j=i+1;j<evencount;j++) {
				if(even[i]>even[j]) {
					int temp=even[i];
					even[i]=even[j];
					even[j]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			arr2[i]=even[i]+odd[i];
		}
		
		return arr2;
	}
	

	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Sort_odd_even obj=new Sort_odd_even();
		int arrr[]=obj.sort(arr);
		for(int i=0;i<arrr.length;i++) {
			System.out.print(arrr[i]+" ");
		}
	}
}
