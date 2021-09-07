package map;
//Qsns
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMap_Methods {
	public static void main(String[] args) {
		HashMap<String,Integer> hm= new HashMap<>();
		hm.put("Air",null);
		hm.put("Pir",10);
		hm.put("Tip",20);
		hm.put("Lip",30);
		hm.put("Kir",40);
		hm.put("Sip",50);
		//get(key)
		System.out.print("\nValue of key- 'Tip'"+hm.get("Tip"));
		//size
		System.out.print("\nSize of Hashmap- "+hm.size());
		//isEmpty()
		System.out.print("\nIs Hashmap Empty- "+hm.isEmpty());
		//containsKey()
		System.out.print("\nDoes it contain key-'Lip'? "+hm.containsKey("Lip"));
		//containsValue()
		System.out.print("\nDoes it have value 40? "+hm.containsValue(40));
		
		
		//Enhanced for loop only works for collections or arrays
		
		System.out.println();
		//Using KeySet method to iterate using set
		Set<String> kk= hm.keySet();					//Return set of type-Keys
		System.out.println(kk);
		
		for(String s:kk) {
			System.out.println(s+"-->"+hm.get(s));		//Gets both Key & Value
			
		}
		//Use Iterator over set
		System.out.println("Using Iterator: ");
		Iterator<String> ss= kk.iterator();
		while(ss.hasNext()) {
			String s= ss.next();
			System.out.println(s+"-->"+hm.get(s));			
		}
				
		//entrySet() returns objects of Entry i.e Objects having key,value pair
		System.out.println("Using entrySet method of HashMap");
		Set<Entry<String,Integer>> ee= hm.entrySet();
		for(Entry<String,Integer> e: ee) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
		//iterating over values of Hashmap
		System.out.println("Iterate over values using ");				//***What's happening here?
		Collection<Integer> c= hm.values();
		for(Integer i:c) {
			System.out.println(i);
		}
		
		hm.put("New", null);
		System.out.println(kk);
		
		
		
		
	}

}
