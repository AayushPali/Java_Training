package aug27;

import java.util.Scanner;

public class Array_2D_maxOfRow_Column {

	public static void main(String[] args) {
		int nrows,ncols;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of rows & cols: ");
		nrows= sc.nextInt();
		ncols= sc.nextInt();
		int[][] arr= new int[nrows][ncols];
		
		System.out.println("\t*ENTER VALUES IN 2D ARRAY*\n");
		
		for(int i=0;i<nrows;i++) 
		{
			System.out.println("Enter ("+ncols+") values at row "+i+" : ");
			for(int j=0;j<ncols;j++)
			{
				
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		//Print max of rows
		int max;
		for(int i=0;i<nrows;i++) 
		{
			max=arr[i][0];
			for(int j=0;j<ncols;j++)
			{
				if(max<arr[i][j])
					max=arr[i][j];
			}
			System.out.print("\nMax of Row "+i+" is: "+max);
		}
		//Print max of columns
		//2 methods, either interchange the rows to columns or try the harder way
		for(int i=0;i<arr[0].length;i++)				//traversing columns
		{
			max=arr[0][i];
			for(int j=0;j<arr.length;j++)
			{
				if(max<arr[j][i])
					max=arr[j][i];
			}
			System.out.print("\nMax of Column "+i+" is: "+max);
		}
		System.out.println("Diagonal: ");
		//Print Diagonal 
		
		for(int c=0;c<arr[0].length;c++)				//traversing columns
		{
			
			for(int r=0;r<arr.length;r++)
			{
				if(r==c)
					System.out.print(arr[r][c]+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println("Reverse Diagonal: ");
		//& Reverse Diagonal
		for(int r=0;r<nrows;r++) 
		{
			
			for(int c=0;c<ncols;c++)
			{
				if(r+c==nrows-1)
					System.out.print(+arr[r][c]+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}
