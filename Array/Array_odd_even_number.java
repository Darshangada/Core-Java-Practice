package Array;

import java.util.Scanner;

public class Array_odd_even_number {

	void Odd_Even(int arr[]) {
		int evencount=0;
		int oddcount=0;
		System.out.println("even number are: ");
		for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					evencount++;
					System.out.print(arr[i]+" ");
				}
				
		}
		System.out.println();
		System.out.println("odd number are: ");
		for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					oddcount++;
					System.out.print(arr[i]+" ");
				}
				
		}System.out.println();
		System.out.println("Even numbers are: "+evencount);
		System.out.println("odd numbers are: "+oddcount);
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
		
		Array_odd_even_number obj= new Array_odd_even_number();
		obj.Odd_Even(arr);
	}
}
