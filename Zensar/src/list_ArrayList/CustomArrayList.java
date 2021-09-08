package list_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
//Sort ArrayList of Student
//Using Comparable 

public class CustomArrayList {
	public static void main(String[] args) {
		
		ArrayList<Student> als= new ArrayList<>();
		als.add(new Student(8, "Pir"));
		als.add(new Student(5, "Nir"));
		als.add(new Student(3, "Norse"));
		als.add(new Student(4, "Lok"));
		als.add(new Student(4, "Lok"));
		
		Collections.sort(als);
		
		for(Student ob:als)
			System.out.println(ob);

		
	}

}
