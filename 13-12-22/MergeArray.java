import java.util.*;
public class MergeArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of array-1 :");
		int n = sc.nextInt();
		System.out.println("Enter a no of array-2 :");
		int m = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		System.out.println("Enter a array-1 :");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter a array-2 :");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int merge[] = new int[m+n];
		for(int i=0;i<n;i++)
		{
			merge[i]=arr1[i];
		}
		for(int i=0;i<m;i++)
		{
			merge[i+n]=arr2[i];
		}
		for(int i=0;i<n+m;i++)
		{
			System.out.print(merge[i]+" ");
		}
	}
}
