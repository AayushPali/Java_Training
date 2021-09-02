package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	while(true) {
	
		try {
		int[] a= {1,2,3,4,5};							//how is it different from int[] a= new int[]{1,2,3,4,5};   ??
		int index;
		System.out.println("Enter index: ");
		index=sc.nextInt();
		System.out.println("Enter value: ");
		a[index]=sc.nextInt();
		sc.close();
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		break;											//breaks loop when no exception is raised
		}
		catch(InputMismatchException e){
			System.out.println("Invalid input");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid index");	
		}
		catch(Exception e) {
			System.out.println("Universal handler");
		}
	}
	System.out.println("End ");
}
}
