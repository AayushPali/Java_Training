package aug26;
//complete
//check and confirm memory allocation of primitive and non primitive data types in stack and heap


public class Where_in_Memory_Stack_or_Heap {
	void concatenate(String name) {
		name+=" Paliwal";
	}
	void array(int[] a2) {
		a2[0]=0;
		a2[1]=0;
	}
	static int returnInt(int num) {
		num*=2;
		System.out.println("(Local variable) num from returnInt: "+num);
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
		System.out.println();
		int[] arr=new int[5];
		String nameString= "Aayush";
		Where_in_Memory_Stack_or_Heap obj= new Where_in_Memory_Stack_or_Heap();
		obj.concatenate(nameString);
		System.out.println(nameString);
		if(nameString=="Aayush")
			System.out.println("String is not referenced as 'Paliwal' not added");
		else
			System.out.println("String is referenced and points to same string in heap");
		//check for array
		
		System.out.println();
		int[] a= {1,2,3,4,5};
		obj.array(a);
		for(int i:a)
			System.out.print(a[i]+" ");
		if(a[0]==0)
			System.out.println("Array is referenced and changes are reflected unlike string");
	}
}
