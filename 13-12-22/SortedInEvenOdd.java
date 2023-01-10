import java.util.*;
public class SortedInEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		System.out.println("Enter a array :");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	
	}
}
