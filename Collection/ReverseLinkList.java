package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkList {
	
	static LinkedList<Integer> Reverse(LinkedList<Integer> list){
		Collections.sort(list,Collections.reverseOrder());
		return list;
	}
	
	static LinkedList<Integer> SortAscendingOrder(LinkedList<Integer> list){
		Collections.sort(list);
		return list;
	}

	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(21);
		list.add(42);
		list.add(88);
		list.add(76);
		list.add(98);
		list.add(12);
		list.add(9);
		System.out.println("Normal List");
		System.out.println(list);
		
		System.out.println("Sort List by Ascending Order:");
		LinkedList<Integer> list2=SortAscendingOrder(list);
		System.out.println(list2);
		
		System.out.println("After Reverse List");
		LinkedList<Integer> list1=Reverse(list);
		System.out.println(list1);
	}
}
