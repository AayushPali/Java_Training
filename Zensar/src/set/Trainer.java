package set;
// VERY IMPORTANT 2 implementations of hashcode and equals....check difference//
public class Trainer {
	private int id;
	private String name;
	
	public Trainer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		System.out.println("Main of Trainer");
	}
	public String toString() {
		return ("\nId-"+id+" |Name-"+name);
	}
	
	/*public int hashCode() {
						//**********
		return 1;		//will always have to go to equals, so will eventually end up checking for all objects of Trainer..beats the purpose of HashMap
						//can't return id as for different name, what if id entered is same...(Car-Name,Color,Model)?
						//will also result in data being entered in same index in hashmap
						//..all data will just go in 2nd(0,1,2,..15) index linked list! All other indexes will be empty!!
	}
	*/
	public int hashCode() {				//both hashcode & equals are overrided from object
		int hashcode;
		hashcode=id*7;
		name=name.toLowerCase();
		hashcode+=name.hashCode();
		//System.out.println("In Hash");			
		return hashcode;	
	}
	
	public boolean equals(Object o) {
		return true;
	}
	/*public boolean equals(Object o) {
		System.out.println("Equals");
		Trainer tobj= (Trainer)o;
		if(this.id==tobj.id)
		{
			if(this.name.equalsIgnoreCase(tobj.name))
			return true;
			else 
				return false;
			
		}
		else
		return false;
	}
	*/
	

}
