package Mindstix;

import java.util.ArrayList;
import java.util.List;

public class Remove_from_collection {

	
	public static void main(String[] args) {
		List<Integer> list=new  ArrayList<Integer>();
		list.add(12);
		list.add(32);
		list.add(52);
		list.add(72);
		list.add(22);
		
		list.remove(Integer.valueOf(22));
		System.out.println(list);
	}
}
