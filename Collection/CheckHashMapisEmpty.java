package Collection;

import java.util.HashMap;
import java.util.Map;

public class CheckHashMapisEmpty {

	public static void main(String[] args) {
		Map<String, String> mp=new HashMap<String, String>();
		
		mp.put("1", "Darshan");
		mp.put("2", "Darshan");
		mp.put("3", "Darshan");
		mp.put("4", "Darshan");
		mp.put("5", "Darshan");
		System.out.println(mp);
		
		System.out.println(mp.size());
		if(mp.isEmpty()) {
			System.out.println("HashMap is Empty");
		}
	}
}
