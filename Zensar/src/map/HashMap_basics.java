package map;
import java.util.HashMap;

public class HashMap_basics {
	public static void main(String[] args) {
	
		
		  HashMap<String,Integer> hm= new HashMap<>(); 
		  hm.put("Aa", 25); 
		  hm.put("BB",20);
		  hm.put("Nir", 25); 
		  hm.put("Pir", 25);
		  hm.put("Sir", 25); 
		  hm.put("Tir", 25);
		  System.out.println(hm);
		  
		
		//Growable hashmap--LoadFactor and Threshold
		HashMap<Integer, String> hm2= new HashMap<>();
		for(int i=1;i<=11;i++) {
			hm2.put(i, "A"+i);
		}
		hm2.put(17, "a");
		hm2.put(18, "b");
		hm2.put(19, "c");
	}
	

}
