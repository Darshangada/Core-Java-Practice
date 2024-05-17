package Mindstix;

import java.util.Arrays;

public class Demo {
	
	static void m1(String [] str) {
		int arr[]=new int [str.length];
		for(int i=0;i<str.length;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
	
		String str[]= {"21","45","56"};
		
		m1(str);
	}
}
