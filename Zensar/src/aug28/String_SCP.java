package aug28;

public class String_SCP {
	
public static void main(String[] args) {
	
	String fname= "Aayush";		
	String fname2= "Aayush";					
																	//s1==s2 checks weather they are pointing to same memory location in heap
	System.out.print("\nBothfname & fname2 have same object location? ");
	System.out.println(fname==fname2);
	//checking same for arrays
	int[] a= {1,2,3};
	int[] b= {1,2,3};
	System.out.print("\nBoth a and b point to same object? ");
	System.out.println(a==b);
	if(a!=b)
		System.out.println("Unlike Strings same valued array variables don't reference address of same object");
	fname+=" Paliwal";
	System.out.println("fname-"+fname);
	System.out.println("fname2- "+fname2);
	System.out.print("\nBoth fname & fname2 have same object location? ");
	System.out.println(fname==fname2);
	fname2+=" Paliwal";
	System.out.println("fname2- "+fname2);
	System.out.print("\nBoth fname & fname2 have same object location? ");
	System.out.println(fname==fname2); 								
																	//fname and fname2 both point to different objects of same value
	System.out.print("\nBoth fname & fname2 have same values in their respective objects? ");
	System.out.println(fname.equals(fname2));
	
	
	fname2="Aayush";
	System.out.println(fname2.compareTo(fname));
	String fname3="aayush";	
	System.out.println(fname2.compareTo(fname3));		
	
	//can enhanced for print string same as it prints array
	//can you parse string to implement logic as in array?
	//check indexOf funtion
	
}
}
