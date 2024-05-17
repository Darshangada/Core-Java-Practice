package Collection;

import java.util.ArrayList;
import java.util.List;

public class Check_values {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(54);
		list.add(165);
		list.add(34);
		list.add(76);
		System.out.println(list);
		System.out.println(list.size());
//		boolean flag=false;
//		
//		for(int i:list) {
//			if(i==54) {
//				flag=true;
//			}
//		}
//		
//		if(flag==true) {
//			System.out.println("then value is present");
//		}
//		else {
//			System.out.println("then value not is present");
//
//		}
		
		if(list.contains(32)) {
			System.out.println("then value is present");
		}
		else {
			System.out.println("then value not is present");

		}
	}
}
