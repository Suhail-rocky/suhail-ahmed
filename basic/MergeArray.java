import java.util.*;
public class MergeArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array-1 :");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter a no of array-2 :");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int count=0;
		int merged[] = new int[m+n];
		for(int i=0;i<n;i++)
		{
			merged[count++]=arr1[i];
		}
		for(int i=0;i<m;i++)
		{
			merged[count++]=arr2[i];
		}
		for(int i=0;i<(m+n);i++)
		{
			System.out.print(merged[i]+" ");
		}
	}
}