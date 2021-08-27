package day3;

public class DivBy5 {
	public static void main(String[] args) {
		short i=0;
		while(i<51) {
			if(i%5==0)
				System.out.println(+i+" is divisible by 5");
			i++;
		}
	}

}
