package list_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class List_Methods {
	public static void main(String[] args) {
		//list specific methods are index specific //same in ArrayList 
		ArrayList<String> al= new ArrayList<>();
		al.add("Aayush");
		al.add(0, "Paliwal");			//inserts at index 0
		System.out.println(al);
		//al.add(5,"New");              //IndexOutOfBound exception
		al.add("");
		al.add("Nagar Haveli");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(" "+al.get(i));
		}
		//enhanced for
		System.out.println();
		for(String s:al) {
			System.out.print(" "+s);
		}
		//Overridden Iterator 
		System.out.println("\nUsing Iterator");
		Iterator<String> i = al.iterator();
		al.add("NEW");
		String data;
		while(i.hasNext()) {
			//data=i.next();
			System.out.print(" "+i.next());		
		}
	}

}
