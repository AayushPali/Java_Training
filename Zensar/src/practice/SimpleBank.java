package practice;

import java.util.Scanner;

public class SimpleBank {
	public static void main(String args[]) {
		
		int choice,balance=1000,amount,loan=0;
		System.out.println("Enter Choice\n"
				+ "1. Deposit \t2. Withdraw \t3.Check Balance \t4.Loan");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		
		switch(choice)
		{
		case 1: System.out.println("Enter Amount:");
				amount = sc.nextInt();
				balance+= amount;
				break;
		
		case 2: System.out.println("Enter Amount to withdraw:");
				amount = sc.nextInt();
				balance-= amount;
				break;
				
		case 3: System.out.println("Your balance is "+balance);
				break;
		
		case 4: System.out.println("Enter loan amount: ");
				loan= sc.nextInt();
				System.out.println("Loan approved of Rs"+loan);
				break;
		
		default:
		}
		
	}

}
