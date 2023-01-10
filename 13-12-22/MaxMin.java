import java.util.*;
public class MaxMin
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		findMaxMin(arr,n,0,0,0);	
	}
	private static void findMaxMin(int arr[],int n,int i,int max,int min)
	{
		if(i == n)
		{
			System.out.print("The Maximum no is "+max);
			System.out.println("The Minimum no is "+min);
			return;
		}
		if(max<arr[i])
		{
			findMaxMin(arr,n,i+1,arr[i],arr[0]);
		}
		else if(min>arr[i])
		{
			findMaxMin(arr,n,i+1,arr[0],arr[i]);
		}
	}
}
