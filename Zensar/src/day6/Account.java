package day6;

import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class Account {
	private int balance;
    private int account_id;
	private String name;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	Account(int account_id, String name,  int balance){
		this.name=name;
		this.account_id=account_id;
		this.balance=balance;
		
	}
	public void withdraw() {
		System.out.println("Enter Amount to Withdraw: ");
		Scanner sc= new Scanner(System.in);
		int amount= sc.nextInt();
		sc.close();
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}
	}
	public void deposit() {
		System.out.println("Enter amount to deposit: ");
		Scanner sc= new Scanner(System.in);
		int amount= sc.nextInt();
		sc.close();
		System.out.println("Old balance :"+balance);
		balance+=amount;
		System.out.println("Successfully Updated./nCurrent Balance: "+balance);
	}
	public int checkBalance() {
		return balance;
	}
	public static void main(String[] args) {
		System.out.println("Enter Name,account id, balance ");
		Scanner sc= new Scanner(System.in); 
		String name=sc.next();
		int bal=sc.nextInt(),account_id=sc.nextInt();
		
		Account user= new Account(account_id,name,bal);
		
		bal=user.checkBalance();
		System.out.println("");
		user.deposit();
		user.withdraw();
		
		
		
	}
	
	

}
