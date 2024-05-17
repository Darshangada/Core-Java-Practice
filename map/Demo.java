package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String> myMap=new HashMap<Integer, String>();
		myMap.put(6, "Darshan");
		myMap.put(2, "Kunal");
		myMap.put(9, "Gaurav");
		myMap.put(8, "Roshan");
		myMap.put(3, "Krushna");
		
		System.out.println(myMap);
		
		List<Map.Entry<Integer, String>> mylist= new ArrayList<>(myMap.entrySet());
		
		Collections.sort(mylist,new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o2.getKey().compareTo(o1.getKey());
			}
		});
		Map<Integer, String> myMap1=new LinkedHashMap<>();
		
		for(Map.Entry<Integer,String> entry:mylist ) {
			myMap1.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(myMap1);
//		Map<Integer, String> myMap = new HashMap<>();
//        myMap.put(6, "Darshan");
//        myMap.put(2, "Kunal");
//        myMap.put(9, "Gaurav");
//        myMap.put(8, "Roshan");
//        myMap.put(3, "Krushna");
//        
//        System.out.println("Original Map: " + myMap);
//        
//        // Convert the map to a list of entries
//        List<Map.Entry<Integer, String>> myList = new ArrayList<>(myMap.entrySet());
//        
//        // Sort the list in reverse order by keys
//        Collections.sort(myList, new Comparator<Map.Entry<Integer, String>>() {
//            @Override
//            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//                return o2.getKey().compareTo(o1.getKey());
//            }
//        });
//        
//        // Create a new map from the sorted entries
//        Map<Integer, String> myMap1 = new LinkedHashMap<>();
//        for (Map.Entry<Integer, String> entry : myList) {
//            myMap1.put(entry.getKey(), entry.getValue());
//        }
//        
//        System.out.println("Map sorted in reverse order by keys: " + myMap1);
	}
}
