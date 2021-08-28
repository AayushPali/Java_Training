package aug26;
import java.util.Scanner;
//1..dynamically take mobile numbers without setting a maximum mobile nos a person can have;
class Student {
	// Takes Number of Mobile number beforehand by user or puts max no of mobile at
	private int id;
	private String nameString;
	private long mobile[];

	void setData() {

			Scanner sc = new Scanner(System.in);
			int size,j=0;		
			System.out.print("\n\tEnter Student Id: ");
			id = sc.nextInt();									
			System.out.print("\n\tEnter Student Name ");
			nameString = sc.next();									// here id and nameString are instance variables.
			System.out.print("\n\tNumber of Mobile Numbers: ");
			size=sc.nextInt();
			long mobile[] = new long[size];							// this can be hard-coded to set a max value
			while(size-->0)
			{
				System.out.print("\nEnter mobile number :"); 		// loop to take multiple numbers
				mobile[j++] = sc.nextLong();
				
			}
			this.mobile=mobile;
			sc.close();
	}
	
	void display() {
		System.out.println("Id"+this.id+" Name: "+nameString+" Mobile Numbers: ");
		for(long d:mobile) 
			System.out.println(d);
	}
}

class Trainer {
	//1..Takes multiple numbers as string and Longparse it into
	private String nameString;
	private long mobile[];
	
	public Trainer(String nameString, long[] mobile) {
		super();
		this.nameString = nameString;
		this.mobile = mobile;
	}
	
	public void display(){
		System.out.print("Trainer name: "+nameString+"\nMobile numbers: ");
		for(long l:mobile)
			System.out.println(l+" ");
		
	}
	
}
	public class Array_of_Object_and {
		
		public static void main(String[] args) {
			
				
				/*
				sobj.setData();
				sobj.display();
				*/
			
				//now for Trainer class
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter name: ");
				String nameString= sc.next();
				
			
				char c='y';
				//short j=0;
				String numberString="";
				while(c=='y'||c=='Y')
				{
					System.out.print("\nEnter Mobile Number: ");			//whilst you can directly assign number to 
					numberString+= sc.next();
					numberString+=" ";
					System.out.print("\nAdd another number(y/n)? ");
					c=sc.next().charAt(0);
					
				}
				sc.close();
				String[] numStringArray= numberString.split(" ");
				for(String s:numStringArray)
					System.out.println(s);									//print numbers from string array
				
				long[] mobile= new long[numStringArray.length];
				int i=0;
				for(String s:numStringArray) 								//used enhanced for as counter to run loop, but s is wasted memory
				{
					mobile[i]= Long.parseLong(s);							//or numStringArray[i]
					i++;
				}
					
				Trainer tobj= new Trainer(nameString, mobile);
				tobj.display();

		}

	}

	/*
	 * String temp; 
	 * System.out.println(temp);
	 * this gives error cuz temp is a local variable that isn't initialised. 
	 * 
	 * There are two methods to initialise string, arrays: Assign a value or use new keyword...
	 * 1---string s = "aayush";
	 * 2--- string s1 = new string(); 
	 * Here s1 will have null value.
	 */