package assignment_1;

import java.util.Scanner;

public class Assign1_4{
	static boolean div_by_5_11(int num) {
		if(num%5==0 && num%11 ==0)
			return true;
		else 
			return false;
	}	
    static boolean leap(int year) {
		
		boolean leap = false;

	    
	    if (year % 4 == 0) {
	      if (year % 100 == 0) {

	   
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;
	    
	    return leap;
	  }
	static int max_num(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3)
			return num1;
		else if (num2>num3)
			return num2;
		else 
			return num3;
	}
	static void calculator() {
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operation (+,-,*,/) :");
		char choice= sc.next().charAt(0);
		System.out.println("Enter 2 numbers");
		int num1=sc.nextInt(),num2=sc.nextInt();
		switch(choice) {
		
		case '+': System.out.println("Addition is :"+(num1+num2));
				  break;
				  
		case '-': System.out.println("Substraction is :"+(num1-num2));
				  break;
		  
		case '*': System.out.println("Multiplication is :"+(num1*num2));
				  break;
		  
		case '/': System.out.println("Division is :"+(num1/num2));
				  System.out.println("Remainder is :"+(num1%num2));
				  break;
		
		default: System.out.println("No Operation performed");
		}
	}
  public static void main(String[] args) {

	java.util.Scanner sc = new Scanner(System.in);
	byte choice;
	do {
	System.out.println("1.Check Leap year\n"
					 + "2.Check if number divisible by 5 & 11\n"
					 + "3.Find max of 3 numbers\n"
					 + "4.Simple calculator\n"
					 + "5.EXIT\n"
					 + "--Enter Choice : ");
	
	choice = sc.nextByte();
	switch(choice) {
	case 1: System.out.println("Enter year to check if leap year : ");
			int year= sc.nextInt();
			if(leap(year))
				System.out.println(+year+" is a Leap year");
			else
				System.out.println("Not a leap year");
			break;
				
	case 2: System.out.println("Enter number:");
			int num= sc.nextInt();
			if(div_by_5_11(num))
				System.out.println(+num+" is divisible by both 5 and 11");
			else
				System.out.println(+num+" is not divisible by both 5 & 11");
			break;
	
	case 3: System.out.println("Enter 3 numbers : ");
			int num1= sc.nextInt();
			int num2= sc.nextInt();
			int num3= sc.nextInt();
			int max_num= max_num(num1,num2,num3);
			System.out.println("Maximum number is :"+max_num);
			break;
	
	case 4: calculator();
			break;
			
	case 5: break;
		
	default:System.out.println("Invalid Input");
	}
	}while(choice!=5);
}
}