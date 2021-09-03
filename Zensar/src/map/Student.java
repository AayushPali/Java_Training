package map;

public class Student {
	int id;
	String name;
	
	public int hashCode() {
		System.out.println("Hi");
		return this.id;
	}
	public boolean equals(Object o) {
		//enters in equals if hash code is same 
		//System.out.println("overriden");
		Student obj= (Student)o;			
		/*ye kyu krte? Object as a parent in parameter to catch 
		instance of type Student?
		Does this checks for every key in the hashMap? No. Only when 
		HashCode is same, but what about custom key where all id & name must be unique--implemented below
		*/
		
		if(this.name.equalsIgnoreCase(obj.getName()))		
			return true;
		else
			return false;
		
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return(" Id: "+id+" | Name: "+name);
	}
	
	

}
