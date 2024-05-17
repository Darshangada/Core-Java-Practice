package Collection;

import java.util.HashSet;
import java.util.Set;

public class Trancer_HashSet {

	public static void main(String[] args) {
		Set<Integer> list= new HashSet<Integer>();
		list.add(12);
		list.add(97);
		list.add(165);
		list.add(34);
		list.add(111);
		list.add(76);
		list.add(43);
		System.out.println(list);
		
		Set<Integer> evenList= new HashSet<Integer>();
		Set<Integer> oddList= new HashSet<Integer>();
		for(int i:list) {
			if(i%2==0) {
				evenList.add(i);
			}
			else {
				oddList.add(i);
			}
		}
		System.out.println(evenList);
		System.out.println(oddList);
	}
}
