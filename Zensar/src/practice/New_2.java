package practice;

import java.util.Scanner;

public class New_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter char");
		char x = sc.next().charAt(0);

		if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) 
		{
			System.out.println("it is alphabet");
		} 
		else if (x >= '0' && x <= '9') {
			System.out.println("digit");
		}
		else {
			System.out.println("Special Character");
		}
	}
}
