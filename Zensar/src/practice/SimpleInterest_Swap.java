package practice;

import java.util.Scanner;

public class SimpleInterest_Swap {
	
	
	  public static void main(String args[]) {
	  
	  Scanner sc= new Scanner(System.in);
	  
	  float final_amount; System.out.println("Enter Principal amount :"); int
	  principal = sc.nextInt(); System.out.println("Enter Rate of Interest: ");
	  float ROI = sc.nextFloat();
	  System.out.println("Enter Years of Investment: "); float no_of_years =
	  sc.nextFloat();
	  
	  final_amount = principal*ROI*no_of_years;
	  System.out.println("Final amount after"+(int)no_of_years+" years is :"
	  +final_amount);
	  
	  
	  }
	 

}
