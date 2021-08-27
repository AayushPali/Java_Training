package day6;

import java.util.Scanner;

/*	MAGIC NUMBER
			1458---1+4+5+8=18
			Reverse 18--81
			Product 18*81=1458  also 1729	*/

public class Magic_Number {
	public static void main(String[] args) {
		int num,num_cpy;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		sc.close();
		num_cpy=num;
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		//System.out.println(sum);
		num=sum;
		int rev=0;
		//now reverse
		while(num!=0) {
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		//System.out.println(rev);
		
		if(sum*rev==num_cpy)
			System.out.println(+num_cpy+" is a MAGIC NUMBER"
					+ "\nAdditon of Digits ="+sum
					+ "\nReverse of Sum = "+rev
					+ "\nMultiplication "+sum+" x "+rev+" = "+rev*sum);
		else {
			System.out.println("Not a Maigic Number");
		}
		
	}
	
}
