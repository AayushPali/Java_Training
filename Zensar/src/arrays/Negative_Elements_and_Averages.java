package arrays;

import java.util.Scanner;


public class Negative_Elements_and_Averages {
														//Array_Assignment Q6,8, 
	int count;    										//instance variables have default values.
	public int printNegative(int[] array)
	{
														//check if call by value or reference in Main by updating array here.
														//ofcourse it will always have to be call by value
														//but do the changes reflect in the calling array? I think yes.
		int i=0,count=0;
		int negArray[]= new int[array.length];
		while(i<array.length) {
			if(array[i]<0) {
				negArray[i]=array[i]; //copy to new array
				count++;
			}
		}
														//using Enhanced for 
		System.out.println("Negative numbers in array : ");
		for(int j:negArray) {
			System.out.println(" "+j);
		}
		System.out.println("Total Negative Numbers = "+count);
														//updating array to see if it changes iArray
		array[0]=-99;
		array[1]=-100;
		
		return 0;
	}
	
	
	public static int average(int[] array) {
		//Could use parametrised constructor to store and access 'size' input 
		// taken in main. Wouldn't have needed .length 
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return(sum/array.length);
	}
	public static double average(double[] array) {
		double sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return(sum/array.length);
	}
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter size");
		size = sc.nextInt();
		System.out.print("\nEnter Int Array(enter some -ve's) : ");
		int[] iArray= new int[size];
		int i=0;
														/*
														 * for(;iArray[i]!=null;) //iArray[i]!='\0' skips as the default value of all array elements is  null or '\0'.
														 * 							Remember, Array and instance variables have default values. They need not be assigned while/after creation.
														 * sc.nextInt(); i++; }
														 */
		while(i<iArray.length) {
			iArray[i++]= sc.nextInt();
		}
														//print using Enhanced for loop
		for(int t:iArray) {
			System.out.print(" "+t);
		}
		System.out.print("\nEnter Double Array: ");
		double[] dArray= new double[size];
		for(i=0;i<dArray.length;i++) {
			dArray[i]= sc.nextDouble();
		}
		for(double d:dArray) {
			System.out.print(" "+d);
		}
		
														//printNegative(iArray); //doesn't work without object
		
		 Negative_Elements_and_Averages obj = new Negative_Elements_and_Averages();
		 obj.printNegative(iArray);
		 												//checking if both actual iArray can be modified.Arrays are in heap.
		 if(iArray[0]==-99 && iArray[1]==-100)
			 System.out.println("They are refering to same array on heap");
		 
		 												//call average(which is static) functions;
		 int avg= Negative_Elements_and_Averages.average(iArray);
		 System.out.println("Average of Integer Array is : "+avg);
		 
		 												// double avg; giving direct call in sysout
		 System.out.println("Average of Double Array is : "+(obj.average(dArray)));
		 
	}
	
	

}
