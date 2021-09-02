package list_ArrayList;
//using Utility Classes.........Helper classes-Arrays & Collections
import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList= new ArrayList<>();
		aList.add("Aayush");
		aList.add("Four");
		aList.add("Nir");
		aList.add("Paa");
		aList.add("Nir");
		System.out.println(aList);
		Collections.reverse(aList);
		System.out.println(aList);
		
		int c= Collections.frequency(aList, "Nir");
		System.out.println("Frequency of 'Nir' is "+c);
		
		Collections.shuffle(aList);
		System.out.println(aList);
		
		Collections.swap(aList, 0, 2);
		System.out.println("Swapped index 0 & 2 :"+aList);
		
		Collections.sort(aList);					//****
		
		System.out.println("Sorted :"+aList);   	//by ASCII value
		Collections.reverse(aList);  
		System.out.println("Decending: "+aList );
		
	}
}
