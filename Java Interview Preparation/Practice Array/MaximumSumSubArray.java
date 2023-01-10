import java.util.*;
public class MaximumSumSubArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxsum=0,sum=0;
		for(int i=1;i<n;i++)
		{
			if(sum < 0)
			{
				sum=arr[i];
			}
			else
			{
				sum += arr[i]; 
				
			}
			if(maxsum > sum)
			{
				maxsum=sum;
			}
		}
		System.out.println(maxsum);
	}
}