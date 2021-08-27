package day4;

import java.util.Scanner;

public class TruePalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt(),num_copy=num,iter=0,last_digit,rev=0;
		sc.close();
		//int intArray[] //can be done by int array, but you'll have to count no. of digits first.
		while(num>0) {
			last_digit=(num%10);
			rev=rev*10+last_digit;	
			num=num/10;
			iter++;
	}
		if(num_copy==rev)
			System.out.println("Entered number "+rev+" of size "+iter+" is a palindrome.");
	}
}
