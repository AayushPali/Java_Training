package aug26;

import java.util.Scanner;

//same logic as explained but here lastswap variable is more efficient than elements.length-1-i
//Here max is assigned lastswap, which is better than elements.length-1-i
public class Bubble_Sort_Optimised_2x {
	
	public void sort(int[] elements) {
		   int max = elements.length - 1;
		   for (; ; ) {
		     int lastSwapped = 0;
		     for (int i = 0; i < max; i++) {
		       int left = elements[i];
		       int right = elements[i + 1];
		       if (left > right) {
		         elements[i + 1] = left;
		         elements[i] = right;
		         lastSwapped = i;
		       }
		     }
		     if (lastSwapped == 0) break;
		     max = lastSwapped;
		   }
		   for(int i:elements)
			   System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		Bubble_Sort_Optimised_2x obj = new Bubble_Sort_Optimised_2x();
		int[] elements= new int[10];
		System.out.print("\nEnter 10 numbers: ");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			elements[i]=sc.nextInt();
			
		}
		sc.close();
		obj.sort(elements);
	}
}
