package list_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Comparator_Custom_ArrayList implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		/*if(o1.getId()>o2.getId())							//descending 
			return 1;
		else if(o1.getId()<o2.getId())
			return -1;
		else 
			return 0; */
		
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<>();
		int id;
		String nameString;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<=3;i++) {
			System.out.println("Enter Id, Name : ");
			id=sc.nextInt();
			nameString=sc.next();
			al.add(new Student(id,nameString));
		}
		sc.close();
		Collections.sort(al, new Comparator_Custom_ArrayList());		//Comparator_Custom_ArrayList being the class that implements compare(T o1,T o2)
				
		for(Student c:al) {
			System.out.println(c.getId()+" |"+c.getName());				//Or simply use toString
		}
		
		
	}
}
