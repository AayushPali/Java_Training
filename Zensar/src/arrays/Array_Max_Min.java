package arrays;

import java.util.Scanner;

public class Array_Max_Min {
	public static void main(String[] args) {
		int size,i=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		size = sc.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter Values: ");
		while(i<arr.length) {
			arr[i]=sc.nextInt();
			i++;
		}
		//fing min and max
		int min=arr[0],max=min;
		for(i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Minimum Value: "+min+" |Maxmimum Value: "+max);
		sc.close();
	}

}
