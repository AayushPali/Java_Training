package map;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class Tree_Map {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm= new TreeMap<>();
		tm.put(20, "Hello");
		tm.put(30, "Thirty");
		tm.put(40, "Forty");
		tm.put(10, "Ten");
		//tm.put(null, "");						doesn't take null key
		tm.put(30, "THIRTY");
		System.out.println(tm);
		
		//print using entrySet
		Set<Entry<Integer,String>> es= tm.entrySet();		//Entry is from Map
		
		for(Entry<Integer, String> eobj: es) {
			System.out.println(eobj);
		}
		//Print Using keyset
		Set<Integer> set= tm.keySet();
		for(int i :set) {
			System.out.println("Key : "+i+" Value : "+tm.get(i));
		}
		//using Iterator
		
		System.out.println("Using Iterator");
		Iterator<Integer> i = set.iterator();
		int iter;
		while(i.hasNext()) {
			iter= i.next();
			System.out.println(iter+"--->"+tm.get(iter));		//why doesn't tm.get(i) works?? Can't pass object of Iterator
		}
		
	}

}






