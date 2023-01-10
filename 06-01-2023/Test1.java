/*1) Given an array, rotate the array by one position in clock-wise direction.

Input:

N = 5

A[] = {1, 2, 3, 4, 5}

Output:

5 1 2 3 4

 

Input:

N = 8

A[] = {9, 8, 7, 6, 4, 2, 1, 3}

Output:

3 9 8 7 6 4 2 1*/
import java.util.*;
public class Test1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter a How many times you want to rotate :");
		int rotation=sc.nextInt();
		rotate(arr,n,rotation);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void rotate(int []arr,int n,int rotation)
	{
		int temp[] = new int[n];
		int k=0;
		for(int i=rotation;i<n;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<rotation;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=temp[i];
		}
	}
}