import java.util.*;
public class SecondLargestNoWithOutSort
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
		int max1=0,max2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] > max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i] > max2 && arr[i] < max1)
			{
				max2 = arr[i];
			}
		}
		System.out.println("First Largest NO : "+max1);
		System.out.println("Second Largest No : "+max2);
	}
}