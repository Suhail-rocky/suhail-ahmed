import java.util.*;
class SumPairinLowTimeComplexity
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
		System.out.println("Enter a sum value :");
		int sum = sc.nextInt();
		sumPair(arr,n,sum);
	}
	public static void sumPair(int arr[],int n,int sum)
	{
		int low=0;
		int high=n-1;
		while(low < high)
		{
			if(arr[low] + arr[high] > sum)
				high--;
			else if(arr[low] + arr[high] < sum)
				low++;
			else if(arr[low] + arr[high] == sum)
			{
				System.out.println("Pair ("+arr[low]+","+arr[high]+")");
				low++;
				high--;
			}
		}
	}
}