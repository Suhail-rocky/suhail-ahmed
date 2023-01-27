import java.util.*;
class BubbleSortUsingRecursion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr,n);
		print(arr);
	}
	static void bubbleSort(int arr[],int n)
	{
		if(n == 1)
			return;
		for(int j=0;j<n-1;j++)
		{
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		bubbleSort(arr,n-1);
	}
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}