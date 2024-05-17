package Array;

import java.util.Scanner;

public class Array {

	void display(int arr[]) {
		for(int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
	
	void reverse(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Display array");
		Array obj=new Array();
		obj.display(arr);
		
		System.out.println();
		System.out.println("Reverse array: ");
		obj.reverse(arr);
	}
}
