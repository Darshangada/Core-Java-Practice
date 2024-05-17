package Array;

import java.util.Scanner;

public class Array_Demo1 {
	void display(int arr[]) {
		for(int i=0;i<arr.length;i++ ) {
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
		System.out.println("Display array:");
		Array_Demo1 obj= new Array_Demo1();
		obj.display(arr);
	}
}
