package aug28;

public class String_SCP {
	
public static void main(String[] args) {
	String hname = new String("InHeap");
	hname.toUpperCase();
	System.out.println(hname);
	hname+=" Concatenated";
	System.out.println(hname);
	String fname= "Aayush";		
	String fname2= "Aayush";					//s1==s2 checks weather they are pointing to same memory location in heap
	System.out.println(fname==fname2);
	fname+=" Paliwal";
	System.out.println(fname);
	System.out.println(fname==fname2);
	fname2+=" Paliwal";
	System.out.println(fname==fname2);			//fname and fname2 both point to different objects of same value
	System.out.println(fname.equals(fname2));
	
	fname2="Aayush";
	System.out.println(fname2.compareTo(fname));
	String fname3="aayush";
	System.out.println(fname2.compareTo(fname3));		
	//
	
	
	//can enhanced for print string same as it prints array
	//can you parse string to implement logic as in array?
	//check indexOf funtion
	
}
}
