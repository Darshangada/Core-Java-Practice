package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertList_ToArray {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(54);
		list.add(165);
		list.add(34);
		list.add(76);
		System.out.println(list);
		
		Integer []arr=list.toArray(new Integer[0]);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		List<Integer> list1=Arrays.asList(arr);
		System.out.println("\n"+list1);
	}
}
