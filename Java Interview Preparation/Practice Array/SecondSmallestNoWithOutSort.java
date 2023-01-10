import java.util.*;
public class SecondSmallestNoWithOutSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min1=10000,min2=10000;
		for(int i=0;i<n;i++)
		{
			if(arr[i] < min1)
			{
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i] < min2 && arr[i] > min1)
			{
				min2 = arr[i];
			}
		}
		System.out.println("First Smallest NO : "+min1);
		System.out.println("Second Smallest No : "+min2);
	}
}