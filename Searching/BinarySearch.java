import java.util.*;
public class BinarySearch
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
		System.out.println("Enter a value to search :");
		int search = sc.nextInt();
		binarySearch(arr,0,n,search);	
	}
	private static void binarySearch(int arr[],int first,int n,int search)
	{
		int last =arr.length-1;
		int mid = (first+last)/2;
		while(first <= last)
		{
			if(arr[mid]<search)
			{
				first = mid+1;
			}
			else if(arr[mid] == search)
			{
				System.out.println(mid);
				break;
			}
			else
			{
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		if(first>last)
			System.out.println("not Found");
	}
}
	