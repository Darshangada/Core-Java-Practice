package pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class fabinaki_Series {

	public static void main(String[] args) {
		int a=0,b=1;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(a);
			int c=a+b;
			a=b;
			b=c;

		}
		System.out.println(list);
		
		boolean match=list.stream().anyMatch(num->num==5);
		
		if(match){
			System.out.println("number 5 is present in given series");
		}
		System.out.println(list.stream().count());
		System.out.println(list.size());
	}
}
