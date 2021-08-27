package practice;
import java.util.Scanner;

public class first {
	
	public static void main(String args[]) {
		
		//sysout ctrl+spacebar
		Scanner sc= new Scanner(System.in);
		
		char gender;
		int num_int;
		long phone;
		float num_float;
		String name;
		
		System.out.println("Enter 2 numbers to add :");
		num_int=sc.nextInt();
		num_float=sc.nextFloat();
		
		System.out.println("Enter First Name: ");
		name=sc.next();
		
		System.out.println("Enter Phone Number :");
		phone=sc.nextLong();
		
		System.out.println("Enter Gender (M/F): ");
		gender=sc.next().charAt(0);
		
		double result= num_int+num_float;
		
		System.out.println("Addition is :"+(num_int+num_float));
		System.out.println("First Name :" +name);
		System.out.println("Phone Number: "+phone);
		System.out.println("Gender is :" +gender );
		
		
		//System.out.println(++num_int);
		
		
	}

}
