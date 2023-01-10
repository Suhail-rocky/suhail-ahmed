import java.util.*;
public class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a element to search : ");
		int search = sc.nextInt();
		linearSearch(arr,n,search);
	}
	private static void linearSearch(int arr[],int n,int search)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
				System.out.println(i);
		}
	}
}