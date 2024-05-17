package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue {

	
	public static void main(String[] args) {
		Map<Integer, String> myMap=new HashMap<Integer, String>();
		myMap.put(6, "Darshan");
		myMap.put(2, "Kunal");
		myMap.put(9, "Gaurav");
		myMap.put(8, "Roshan");
		myMap.put(3, "Krushna");
		
		System.out.println(myMap);
		
		List<Map.Entry<Integer, String>> list=new ArrayList<>(myMap.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<Integer, String	>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		Map<Integer, String> sorteMap=new LinkedHashMap<Integer, String>();
		
		for(Map.Entry<Integer, String> sorted:list) {
			sorteMap.put(sorted.getKey(), sorted.getValue());
		}
		
		System.out.println(sorteMap);
	}
}
