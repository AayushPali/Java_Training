package map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_ArrayList_Frequency {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		al.add("Apple");
		al.add("BlackBerry");
		al.add("Nokia");
		al.add("Samsung");
		al.add("Apple");
		al.add("Mi");
		
		//Frequency
		HashMap<String,Integer> hm= new HashMap<>();
		for(String brand: al) {
			if(hm.containsKey(brand)) {
				int curcount=hm.get(brand);
				hm.put(brand, curcount+1);
			}
		}
		
	}

}
