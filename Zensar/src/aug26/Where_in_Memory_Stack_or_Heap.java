package aug26;
//check and confirm memory allocation of primitive and non primitive data types in stack and heap
public class Where_in_Memory_Stack_or_Heap {
	static void concatenate(String name) {
		name+=" Paliwal";
	}
	static int returnInt(int num) {
		num*=2;
		System.out.println("(Local variable num from returnInt: "+num);
		return (num);
	}

	/*
	  static void returnInt(int num) {
	  num*=2;
	  System.out.println("(Local variable num from returnInt: "+num); //return
	  (num); }
	 */ 
	//this gives error as different return type don't matter in overloading.
	//
	public static void main(String[] args) {
		
		int num=10;
		System.out.println("(Primitive)Number 'num' form main: "+num);
		returnInt(num);							//can't call non static member without object
		System.out.println("(Primitive)Number 'num' after calling void/int rerturnInt: "+num);
		System.out.println("As number isn't changed in main, that means both have been allocated memory "
				+ "saperately in stack");
		
		//now check for non primitive data types- string and arrays
		int[] arr=new int[5];
		String nameString= "Aayush";
		
	}
}
