package arrays;
import java.util.Scanner;
public class Reverse_Array {
	public static void main(String[] args) {
		int[] arr= new int[5];
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for(i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
		System.out.println("Reverse array");
		--i;
		while(i>=0) {
			System.out.print("-->Index @ "+i+":"+arr[i]);	
			--i;
		}
	}

}
