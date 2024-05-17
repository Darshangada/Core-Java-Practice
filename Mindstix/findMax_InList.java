package Mindstix;

import java.util.ArrayList;
import java.util.List;

public class findMax_InList {

	static int findMax(List<Integer> list){
		
	int max=0;
		for(Integer a:list){
			if(a>max){	
				max=a;
			}
		}
return max;
	}

	public static void main(String [] args){
		
	List<Integer> list= new  ArrayList<Integer>();
	list.add(21);
	list.add(31);
	list.add(65);
	list.add(94);
	list.add(10);
	list.add(2);
	list.add(23);
	list.add(45);
	list.add(89);
	list.add(102);
	list.add(12);

	int max=findMax(list);
	System.out.println(max);
	}


}