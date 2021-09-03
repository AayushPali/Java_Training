package set;

import java.util.HashSet;
import java.util.Iterator;

public class basics_HashSet {
	//Set uses map in background.
	//Insertion order not preserved
	
	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<>();
		hs.add("Good");
		hs.add("Apostate");
		hs.add("Sulphate");
		hs.add("Nitrate");
		hs.add("Sum");
		hs.add("Sum");
		//Only 2 ways to iterate HashSet...whereas List has 4-5(?find out how many)
		for(String s:hs)
			System.out.println(s);
		System.out.println("Using Iterator");
													//Insertion Order not preserved. Use LinkedHashSet to preserve order
		Iterator i = hs.iterator();					//asks to make iterator generic
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
	}

}
