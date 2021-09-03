package map;
//****Qsns
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//Identify if duplicate entry possible and need to override hashMap and equals


public class HashMap_CustomClass {
	public static void main(String[] args) {
		HashMap<Student,Integer> hm= new HashMap<>();		//Why does hm checks for overridden methods in Student??
		hm.put(new Student(20,"Mir"), 107);
		hm.put(new Student(22,"Pan"), 207);
		hm.put(new Student(24,"Shu"), 307);
		hm.put(new Student(20,"Mir"), 407);					//new key(20,Mir) over-writes value (107->407)
		hm.put(new Student(20,"Lop"), 107);					//this should print, but doesn't because hashcode returns 20, 
		
		//print all
		
		Set<Student> s= hm.keySet();
		
		/*for(int i=0;i<hm.size();i++) 						//Can't iterate using simple for...
		{
			System.out.println("KEY- "+s+"VALUE- "+hm.get(s));
			
		}
		*/
		
		System.out.println(hm);
		System.out.println();
		
		//Using keySet
		
		for(Student st:s) {
			System.out.println("KEY-"+st+" VALUE-"+hm.get(st));
		}
		System.out.println();
		
		//Using Entry Set
		System.out.println("Using Entry Set:");
		  Set<Entry<Student,Integer>> es= hm.entrySet(); 
		  for(Entry <Student,Integer> e:es) {
			  System.out.println(e.getKey()+" "+e.getValue());
		  }
		 
		
		//Iterator not Preferred in map
		System.out.println("Using Iterator(On Set) :");
		Iterator<Student> is= s.iterator();						//Iterator only works on collections
		while(is.hasNext()) {
			//System.out.println(is+"-->"+hm.get(is));			//Runs infinite loop 
			Student s3=is.next();
			System.out.println(s3+" "+hm.get(s3));
		}
		
		
		
		
		
		
		
	}

}
