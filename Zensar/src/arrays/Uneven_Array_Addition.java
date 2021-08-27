package arrays;

import java.util.Arrays;

public class Uneven_Array_Addition {
	
	
public static void main(String[] args) {
	
	int m=10,n=90;
	int sum=m+n;
	
	int[] a= {1,2,3,4};
	int[] b= {4,5,6,7,8,9};
	
	int max=a.length>b.length?a.length:b.length;
	
	int[] c=new int[max];
	
	/*for(i=0 ;i<c.length;i++)
	{
	c[i]=a[i]+b[i];
	}	*/
	for(int i=0 ;i<c.length;i++)
	{
		
		
		if(i<a.length && i<b.length)
		{
		c[i]=a[i]+b[i];
		
		}
		else if(i<a.length)
		{
			c[i]=a[i];
			
		}
		else if(i<b.length)
		{
			c[i]=b[i];
		}
	}
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
}
}
