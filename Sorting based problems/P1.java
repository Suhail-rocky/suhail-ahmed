 /*Given a permuted array of length N of first N natural numbers, we need to tell the minimum
number of swaps required in the sorted array of first N natural number to reach given permuted
array where a number can be swapped with at most 2 positions left to it. If it is not possible to
reach permuted array by above swap condition then print not possible.
Input : arr = [1, 2, 5, 3, 4]
Output : 2
We can reach to above-permuted array in total 2 swaps as shown below,
[1, 2, 3, 4, 5] -> [1, 2, 3, 5, 4] -> [1, 2, 5, 3, 4]
Input : arr[] = [5, 1, 2, 3, 4]
Output : Not Possible
It is not possible to reach above array just by swapping numbers 2
positions left to it.
*/
import java.util.*;
class P1
{	
	static int count=0;
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
		selectionSort(arr,n);
	}
	public static void selectionSort(int arr[],int n)
	{
		int smallest=0;
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			smallest=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[smallest])
				{
					smallest=j;
					count++;
				}
			}
			temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
		}
		print(arr,n);
	}
	public static void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		if(count == 2)
		{
			System.out.println("minimum number of swapping are : "+count);
		}
		else
		{
			System.out.println("Not Possible ");
		}
		
	}
}