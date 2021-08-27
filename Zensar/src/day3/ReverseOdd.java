package day3;
import java.util.Scanner;

public class ReverseOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=100;
		System.out.println("Enter number:");
		num = sc.nextInt();
		sc.close();
		while(num>0) {
			if(num%2!=0)
			{
				System.out.print(+num+" ");
			}
			num--;
		}
	}

}
