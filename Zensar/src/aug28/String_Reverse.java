package aug28;

public class String_Reverse {
	public static void main(String[] args) {
		String vehicle= "Truck";
		for(int i=vehicle.length()-1;i>=0;i--) {
			System.out.print(vehicle.charAt(i));
		}
		System.out.println();
		//same, but by converting to character array first
	
		char[] arr=vehicle.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		//check palindrome
		String palindrome= "Conoc";					//what difference if created by using new keyword
		palindrome=palindrome.toLowerCase();					//error resolved- you didn't store the value created and returned by toLowerCase function.
		int j=palindrome.length()-1;
		boolean flag=true;
		for(int i=0;i<palindrome.length();i++) 
		{
			if(palindrome.charAt(i)!=palindrome.charAt(j--))
			{
				flag=false;
				break;    
			}
		}
		if(flag) {
			System.out.println("\nEntered string is a palindrome");
		}
	}

}
