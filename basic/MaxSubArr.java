import java.util.*;
public class MaxSubArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter sum value :");
		int k=sc.nextInt();
		int res=0;
		for(int i=0;i<k;i++)
		{
			res += arr[i];
		}
		int sum=res;
		for(int i=k;i<n;i++)
		{
			sum += arr[i] - arr[i-k];
			if(res < sum)
			{
				res=sum;
			}
		}
		System.out.println(res);
		
	}
}