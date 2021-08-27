package day3;

public class IsFibo_Palindrome {
	
	public void Fibonacci() {
		int prev_num=0,num=1,count=0;
		System.out.println("Printing Fibonacci till 50");
		//how to stop iteration when number overflows size of int?
		while(count!=50) {
			num=num+prev_num;
			prev_num=num;
			System.out.println(num+" ");
			count++;
		}
		
	}
	public void Palindrome() {
		short num=0,first,last;         //temp;
		/* but what if number is to be of int type and taken as input by user? */
		System.out.println("Printing all palindromes up till 1000");
		while(num<1000) {
			if(num<=99) {
				first=(short) (num/10);
										//temp=(short)10;
				last=(short) (num%10);  //last=num%temp;  
				  					   	//last=(num%((short)10)); why doesn't this work??
				if(first==last)
					System.out.println(num+" is Palindrome");
				
			}
			else {
				first=(short) (num/100);
				last=(short) (num%((short)10));
				if(first==last)
					System.out.println(num+" is Palindrome");
			}
			num++;
		}
	}
		
	public static void main(String[] args) {
		new IsFibo_Palindrome().Fibonacci();
		new IsFibo_Palindrome().Palindrome();
		//why can't a normal call be given to non-static members?
	}
}
