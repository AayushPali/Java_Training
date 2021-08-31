package list_ArrayList;

import java.util.*;
//java.util.ArrayList
public class Collection_Methods {
	//ArrayList implements these methods of Collection Interface
	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<>(5);
		System.out.println(obj.size());
		obj.add("A");
		obj.clear();
		obj.add("B");
		obj.add("C");
		obj.add("");
		obj.add("E");
		System.out.println(obj);
		System.out.println(obj.size());
		obj.add("Z");
		obj.add("Z");									//duplicates allowed in List
		System.out.println(obj);
		obj.remove("Z");								//removes first occurrence 
		System.out.println(obj);
		//String[] s1= {"A","B","Z"};
		ArrayList<String> al2= new ArrayList<>();		//dosen't take string array in constructor;
		al2.addAll(obj);
		al2.add("Unique to al2");
		System.out.println(al2);
		al2.retainAll(obj);
		System.out.println(al2);
														//print using iterator  
		Iterator<String> i= obj.iterator();
		while(i.hasNext())
		{
			String dataString= i.next();
			System.out.print(" "+dataString);
		}
	}

}
