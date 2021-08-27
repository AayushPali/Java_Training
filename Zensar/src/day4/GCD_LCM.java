package day4;
//Update-Revisit
import java.util.Scanner;

public class GCD_LCM {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int lcm=1,gcd=1;
		boolean isLcm=false;
		System.out.println("Enter 2 numbers"); //Do program where Ask user for number of numbers first
		int num=sc.nextInt();
		int num2= sc.nextInt();
		sc.close();
		int min=num>num2?num2:num;
		int max=num>num2?num:num2;
		//gcd
		for(int i=2;i<min/2;i++) //optimally this should i should iter till half of smallest number(DONE)
		{
				if(num%i==0 && num2%i==0) {
					gcd=i;
				}			
		}
		//lcm
		for(int i=min;i<max*10;i++) {
			if(i%num==0 && i%num2==0) {
				if(!isLcm) {
					lcm=i;
					isLcm=true;
				}
			}
				
	}
	/*
	 * if(!isLcm) lcm=1; if(!isGcd) gcd=1;
	 */
		
		
		System.out.println("LCM : "+lcm+" \nGCD: "+gcd);
	}
}
