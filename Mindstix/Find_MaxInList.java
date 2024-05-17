package Mindstix;

import java.util.ArrayList;
import java.util.List;

public class Find_MaxInList {
	
	static int findMax(List<Integer> list) {
		
		int max=0;
		
		for(Integer a:list) {
			if(a>max) {
				max=a;
			}	
		}
		return max;
		 
	}

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(52);
		list.add(32);
		list.add(888);
		list.add(74);
		list.add(63);
		list.add(89);
		list.add(12);
		
		int max=findMax(list);
		System.out.println(max);
	}
}
