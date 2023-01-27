import java.util.*;
class TwoSumPair
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
		System.out.println("Enter a target :");
		int target = sc.nextInt();
		twoSumBruteForce(arr,n,target);
	}
	public static void twoSumBruteForce(int arr[],int n,int target)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}