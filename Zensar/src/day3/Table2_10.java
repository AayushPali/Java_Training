package day3;

public class Table2_10 {
	public static void main(String[] args) {
		short num=2;
		short iter=1;
		while(num<=10) {
			System.out.println("\nTable of "+num+" is :");
			iter=1;
			while(iter<=10) {
				System.out.print("\t "+(num*iter));
				iter++;
			}
			num++;
		}
	}

}
