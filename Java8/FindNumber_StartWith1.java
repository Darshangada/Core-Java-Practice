package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindNumber_StartWith1 {
	
	static void find_NumberStartWith_1(ArrayList<String> list){
		List<String> list1=  list.stream().filter(s -> s.startsWith("1"))
                .toList();
		for(String i:list1) {
			System.out.println(i);
		}
		
	}
	

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("21");
		list.add("54");
		list.add("19");
		list.add("43");
		list.add("12");
		list.add("19");
		list.add("43");
		list.add("13");
		list.add("76");
		list.add("87");
		list.add("1");
		list.add("21");
		System.out.println(list);
		System.out.println("Numbers are start with 1");
		find_NumberStartWith_1(list);
	}
}
