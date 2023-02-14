/*Given an array of n strings. The task is to print the strings in sorted order. The approach should
be such that no string should be copied to another string during the sorting process.
Input : {"ball", "pen", "apple", "kite"}
Output : apple ball kite pen*/
import java.util.*;
class P3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		String arr[]= new String[n];
		char c[]=new char[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
			c[i]=arr[i].charAt(0);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}*/
		System.out.println("The Unsorted array are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		String copy[]=new String[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(c[i] == arr[j].charAt(0))
				{
					copy[i]=arr[j];
				}
			}
		}
		System.out.println();
		System.out.println("The sorted array are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(copy[i]+" ");
		}
	}
}
