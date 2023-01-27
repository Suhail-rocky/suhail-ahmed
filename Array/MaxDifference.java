import java.util.*;
class MaxDifference
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
		int ans =maxDiff(arr,n);
		System.out.println(ans);
	}
	public static int maxDiff(int arr[],int n)
	{
		int max=0,ans=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					ans=arr[j]-arr[i];
				}
				if(ans < 0)
				{
					ans *=-1;
				}
				if(ans > max)
				{
					max=ans;
				}
			}
		}
		return max;
	}
}
