import java.util.*;
class MergedArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array-1 :");
		int n = sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter a no of array-2 :");
		int m = sc.nextInt();
		int arr2[]=new int[n];
		int merged[] = new int[n+m];
		int x=0;
		System.out.println("Enter a array-1 :");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
			merged[x++]=arr1[i];
		}
		System.out.println("Enter a array-2 :");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
			merged[x++]=arr2[i];
		}
		
		for(int i=0;i<n+m;i++)
		{
			System.out.print(merged[i]+" ");
		}
	}
}