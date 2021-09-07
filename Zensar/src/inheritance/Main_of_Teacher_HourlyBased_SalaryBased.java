//to show run time polymorphism
package inheritance;

public class Main_of_Teacher_HourlyBased_SalaryBased {
	
	public static void main(String args[]) {
		/*
		 * as teacher is abstract, can't create it's object 
		 * Teacher tobj= new Teacher();
		 */
		HourlyBased hobj=new HourlyBased(250,50);
		hobj.setTid(1001);
		hobj.setTname("Arvind");
		hobj.setMobileNo(7522568641L);
		hobj.salary();
		
		SalaryBased sobj= new SalaryBased(7500);
		sobj.salary();
		//didn't knew this was possible...as Teacher is abstract class
		
		Teacher teacher = new SalaryBased();		
		teacher.salary();
		
		//Teachers teacher2= new Teacher();
		
		//but this won't show runtime polymorphism, need to assign
		//Teacher as concrete class, so as to create it's object and 
		//reference them to H&S and then call salary().
		//But will that be run time polymorphism??
		//By overriding abstract salary of Teacher??
		
		
		
	}

}
