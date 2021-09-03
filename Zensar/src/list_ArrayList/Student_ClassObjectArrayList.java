package list_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import map.Student;

public class Student_ClassObjectArrayList {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Student> studentObjList = new ArrayList<>(3);
		for(int i=0;i<3;i++) {
			System.out.print("\nEnter Id & Name- ");
			int id =sc.nextInt();
			String name=sc.next();
			studentObjList.add(new Student(id,name));
		}		
		sc.close();
		//print all using 
		for(Student s:studentObjList) {
			System.out.println(s);
		}
		//Using Iterator
		Iterator<Student> i= studentObjList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
