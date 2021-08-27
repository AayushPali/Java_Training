package arrays;

public class Reverse_Array2 {
	public static void main(String[] args) {
		int[] arr= {1,3,0,5,0,6};
		int[] arr2= new int[arr.length];
		
		//shift zeros to last, second last and so on;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr2[j++]=arr[i];
			}
		}
		for(int i:arr2)
			System.out.print(i);
	}

}
