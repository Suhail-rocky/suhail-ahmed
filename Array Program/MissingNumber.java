import java.util.Scanner;
import java.util.*;
class MissingNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=findMissingNo(arr);
		System.out.println(ans);
		
		
	}
	public static int findMissingNo(int arr[])
	{
		int temp[]=new int[arr.length];
		int x=0;
		for(int i=0;i<temp.length;i++)
		{
			x++;
			temp[i]=x;
		}
		sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(temp[i] != arr[i])
			{
				return temp[i];
			}
		}
		return -1;
	}
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}