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
		int j2=arr[0].length;
		for (i = 0; i < nrows; i++) 
		{
			System.out.println("Enter " + j2 + " values in row " + i + " : ");
			for (j = 0; j < arr[j].length; j++) 
			{	j2=arr[j].length;
				arr[i][j] = sc.nextInt();
			}
		}
		// print 2d array

		for (int[] m : arr) {
			for (int n : m)
				System.out.println(n + " ");
			System.out.println();
		}

	}

}
