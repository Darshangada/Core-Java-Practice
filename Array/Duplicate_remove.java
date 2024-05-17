package Array;

import java.util.Scanner;

public class Duplicate_remove {
	void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	void duplicate(int arr[]) {
	    int arr2[] = new int[arr.length];
	    int count = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        boolean duplicatev = false;
	        for (int j =0; j < count; j++) {
	            if (arr[i] == arr2[j]) {
	            	duplicatev = true;
	                break;
	            }
	        }
	        if (!duplicatev) {
	            arr2[count] = arr[i];
	            count++;
	        }
	    }
	    for (int i = 0; i < count; i++) {
	        System.out.print(arr2[i] + " ");
	    }
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
		
		Duplicate_remove obj= new Duplicate_remove();
		System.out.println();
		System.out.println("Display elements in array: ");
		obj.display(arr);
		
		System.out.println();
		System.out.println("Display elements without duplicate in array: ");
		obj.duplicate(arr);
		
	}
}
