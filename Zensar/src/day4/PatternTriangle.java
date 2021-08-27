package day4;

import java.util.Scanner;

public class PatternTriangle {
	public static void main(String[] args) {
		// print isosceles/pyramid pattern
		System.out.println("Enter number of rows to print: ");
		Scanner sc = new Scanner(System.in);
		int iter = 0, rows = sc.nextInt();
		int spaces = rows / 2;
		System.out.println(spaces);
		sc.close();
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j <= rows; j++) {
				int temp = spaces - iter;
				iter += 2;
				while (temp != 0) {
					System.out.print("_");
					temp--;
				}
				if (j < (2 * iter + spaces))
					System.out.print("*");

			}
			System.out.println();
		}
	}

}
