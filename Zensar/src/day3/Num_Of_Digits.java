package day3;

import java.util.Scanner;

public class Num_Of_Digits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num= sc.nextInt(),copy, count=1;
		sc.close();
		copy=num;
		while(num/10!=0) {
			if((num=num/10)>0)
				count++;	
		}
		System.out.println("Number of digits in "+copy+" is "+count);
		
	}
	//Revise decimal to binary and bits to decimal conversion
}
