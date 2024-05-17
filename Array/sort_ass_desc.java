package Array;

import java.util.Scanner;

public class sort_ass_desc {
	void display_Array(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	int [] sort_asc(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		return arr;
	}
	
int [] sort_dsc(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arrya size: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter element in array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		sort_ass_desc obj=new sort_ass_desc();
		System.out.println("Display array elements: ");
		obj.display_Array(arr);
		
		System.out.println();
		System.out.println("Display asc array elements: ");
		int asc[]=obj.sort_asc(arr);
		obj.display_Array(asc);
		
		System.out.println();
		System.out.println("Display dsc array elements: ");
		int dsc[]=obj.sort_dsc(arr);
		obj.display_Array(dsc);
	}
}
