package aug27;

import java.util.Scanner;
//error he
public class Jagged_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int nrows = sc.nextInt();
		int[][] arr = new int[nrows][];
		/*
		 * arr[0]= new int[3];
		 * arr[1]= new int[2]; 
		 * arr[2]= new int[1];
		 */
		// OR
		int i = nrows, j = 0;
		while (i > 0) {
			arr[j++] = new int[i--];
		}
		
		for (int[] m : arr) {
			for (int n : m)
				System.out.print(m[n] + " ");
			System.out.println();
		}
		
		int j2;
		for (i = 0; i < nrows; i++) 
		{
			j2=arr[i].length;
			System.out.print("\nEnter " + j2 + " values in row " + i + " : ");
			for (j = 0; j <arr[i].length ; j++) 
			{
				
				arr[i][j] = sc.nextInt();
			}
			
		}
		// print 2d array
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		/* This is giving error
		 * for (int[] m : arr) { for (int n : m) { System.out.print(m[n] + " "); }
		 * System.out.println(); }
		 */

	}

}
