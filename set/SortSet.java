package set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {

	public static void main(String[] args) {
		Set<Integer> mySet=new HashSet<Integer>();
		mySet.add(12);
		mySet.add(74);
		mySet.add(44);
		mySet.add(9);
		mySet.add(90);
		mySet.add(98);
		
		System.out.println(mySet);
		
		Comparator<Integer> sort=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		
		 Set<Integer> sortedSet = new TreeSet<>(sort);
		 
		 sortedSet.addAll(mySet);
		for(Integer My:sortedSet) {
			
			System.out.println(My);
		}
		
	}
}
