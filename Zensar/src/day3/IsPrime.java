package day3;

public class IsPrime {
	public static boolean Is_Prime(int num) {
		
		if(num%2==0 || num%3==0 || num%5==0 || num%7==0)
		{
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		int num=0;
		while(num<=50)
		{
			if(Is_Prime(num))
			{
				System.out.println(+num+" is PRIME");
			}
			num++;
		}
	}

}
