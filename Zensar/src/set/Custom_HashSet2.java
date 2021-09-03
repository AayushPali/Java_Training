package set;
//***See how contains doesn't give proper result unless hashcode is overridden
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Custom_HashSet2 {
	//to avoid duplicate values, instead of overloading equals and hashcode
	//simply check hs.contains **!!! Doesn't work on custom objects!!!***
	
	public static void main(String[] args) {
		int[] id= {101,102,103,101};
		String[] name= {"aayush","Pop","nop","Aayush"};
		
		HashSet<Trainer2> hs = new HashSet<>();
		for(int i=0;i<4;i++) {
			
			Trainer2 t= new Trainer2(id[i], name[i]);
			if(hs.contains(t))										
				System.out.println("Duplicate entries"+t+" not allowed");  	//hash overriden but commented in Trainer2
			else
			hs.add(t);
		}
		System.out.println(hs); 					//by overriding toString
		Iterator i= hs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
