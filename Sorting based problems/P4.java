/*Given an array arr[] of size ‘n’ and a positive integer k. Consider series of natural numbers and
remove arr[0], arr[1], arr[2], …, arr[p] from it. Now the task is to find k-th smallest number in the
remaining set of natural numbers. If no such number exists print “-1”.
Input : arr[] = { 1 } and k = 1.
Output: 2
Natural numbers are {1, 2, 3, 4, .... }
After removing {1}, we get {2, 3, 4, ...}.
Now, K-th smallest element = 2.
Input : arr[] = {1, 3}, k = 4.
Output : 6
First 5 Natural number {1, 2, 3, 4, 5, 6, .. }
After removing {1, 3}, we get {2, 4, 5, 6, ... }*/
import java.util.*;
class P4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=10;
		int temp[]=new int[m];
		int x=0;
		for(int i=1;i<=m;i++)
		{
			temp[x++]=i;
		}
		System.out.println("Enter a number : ");
		int k= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i] == temp[j])
				{
					temp[j]=0;
				}
			}
		}
		int ans[]=new int[m];
		int y=0;
		for(int i=0;i<m;i++)
		{
			if(temp[i] != 0)
			{
				System.out.print(temp[i]+" ");
				ans[y++]=temp[i];
			}
		}
			System.out.println();
			System.out.println("answer :"+ans[k-1]);
	}
}