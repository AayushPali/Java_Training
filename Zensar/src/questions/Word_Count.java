package questions;

import java.util.Scanner;

public class Word_Count {
	public static void main(String[] args) {
		String sentence;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Sentence: ");
		sentence= sc.nextLine();
		System.out.print("\nEnter word :");
		String word= sc.nextLine();
		sc.close();
		String[] ss= sentence.split(" ");
		
		int count=0;
		for(int i=0;i<ss.length;i++)
		{
			if(ss[i].equalsIgnoreCase(word))
				count++;
			//Write logic to drop ., from words.
		}
		System.out.println("Occurance of '"+word+"' in above sentence--->"+count);
		
		
		
		
	}

}
