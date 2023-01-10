
import java.util.*;
public class Sub_array_Addition{
	static int n;
	static int lenOfLongSubArr(int []arr,int arr_size,int sum)
	{
		int maxlength = 0;
		for(int i=0;i<arr_size;i++)
		{
			int Sum = 0;
			for(int j=i;j<arr_size;j++)
			{
				Sum += arr[j];
				if(Sum == sum)
				{
				maxlength = Math.max(maxlength,j-i+1);
				}
			}
		}
	return maxlength;
}
		


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter a sum value :");
		int sum = sc.nextInt();
		int arr_size = arr.length;
		System.out.println(lenOfLongSubArr(arr,arr_size,sum));
	}
	
}
		
