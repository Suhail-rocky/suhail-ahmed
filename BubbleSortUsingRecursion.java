import java.util.*;
public class BubbleSortUsingRecursion
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
		BubbleSortUsingRecursion(arr,n);
		System.out.println(Arrays.toString(arr));
	}
	static void BubbleSortUsingRecursion(int arr[],int n)
	{
		if( n == 1)
		{
			return;
		}
		for(int j=0;j<n-1;j++)
		{
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		BubbleSortUsingRecursion(arr,n-1);
		
	}
}