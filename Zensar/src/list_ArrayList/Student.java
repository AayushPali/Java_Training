package list_ArrayList;

//import java.util.Collection;

public class Student implements Comparable<Student> {
	int id;
	String name;
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
	@Override
	public int compareTo(Student o) {
		//return  .name.compareToIgnoreCase(o.name);				//because string is a class.
		/*if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		else {
			return 0;
			}*/
		
		return this.id-o.id;										//Limitaions- What if u want to sort from Name or Class or Sports?
																	//
		
	}

}
