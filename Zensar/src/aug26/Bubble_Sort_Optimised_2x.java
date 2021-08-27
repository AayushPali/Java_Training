package aug26;
//complete implementation

/*
* Optimized: in each iteration, more than one element can be placed in its
* final position; we assume all elements after the last swap to be sorted.
* if array is 1 10 34 21 44 55 66--> Then iteration will only continue till 44.
* EXCELLENT LOGIC of LASTSWAP VARIABLE USED TO STORE INDEX OF LAST SWAPPED NUMBER OF ARRAY
* 
* code by- @author <a href="sven@happycoders.eu">Sven Woltmann</a>
*/

//same logic as mam's but we use lastswap variable more efficiently than doing elements.length-1-i
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
	}
	
	public static void main(String[] args) {
		Bubble_Sort_Optimised_2x obj = new Bubble_Sort_Optimised_2x();
		int[] elements;
		for(int i=0;i<2) {
			
		}
		obj.sort(null);
	}
}
