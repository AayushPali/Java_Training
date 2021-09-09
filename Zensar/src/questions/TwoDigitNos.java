package questions;
//Write a Java program to calculate how many two digit numbers are there in ArrayList<Integer> of 5 Integers(categoty : Medium)
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDigitNos {
public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<Integer>();
	System.out.println("Enter 5 Number:");
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<5;i++) {
		al.add(sc.nextInt());
	}
	sc.close();
	
	System.out.println("2 digit numbers are: +"
			+ "");
	for(Integer i:al) {
		if(i/10>0) {
			System.out.print(i+" ");
		}
	}
}
}
