package arrays;

import java.util.Scanner;

public class Check_Vowels {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		//char[] alpha={a,b,c,d,f,o} //hardcode.Not dynamic
		char[] alpha= new char[size];
		System.out.println("Enter Alphabets(use space/enter to saperate)");
		int i,vowel=0;
		for(i=0;i<size;i++) {
			alpha[i]=sc.next().charAt(0);
			if(alpha[i]=='a'|| alpha[i]=='e'||alpha[i]=='i'||alpha[i]=='o'||alpha[i]=='u'){
				vowel++;
			}
		}
		System.out.println("Number of Vowels: "+vowel);
		//print using enhanced for loop
		for(char d:alpha)
			System.out.print(d);
		
	}

}
