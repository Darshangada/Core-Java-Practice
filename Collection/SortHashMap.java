package Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> mp=new TreeMap<Integer, String>();
		
		mp.put(1, "Darshan");
		mp.put(3, "kunal");
		mp.put(2, "devesh");
		mp.put(6, "roshan");
		mp.put(4, "krushna");
		System.out.println(mp);
		
	}
}
class CutomizeSorting implements Comparator<String>{
	@Override
	public int compare(String i1, String i2) {
		return i2.compareTo(i1);
	}
}
