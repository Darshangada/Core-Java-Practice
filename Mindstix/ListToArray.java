package Mindstix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray {

	
	public static void main(String[] args) {
		 
		List<Integer> list=new  ArrayList<Integer>();
		list.add(12);
		list.add(32);
		list.add(52);
		list.add(72);
		list.add(22);
		
		System.out.println(list);
		
//		Collections.reverse(list);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		//System.out.println(Collections.binarySearch(list,88));
		
		Integer arr[]=list.toArray(new Integer[list.size()]);
		for(Integer array:arr) {
			System.out.println(array);
		}
		
		String [] arr1= {"apple","banana","orange"};
		
		for(String array:arr1) {
			System.out.println(array);
		}
		List<String> list1=Arrays.asList(arr1);
		System.out.println(list1);
	}
}
