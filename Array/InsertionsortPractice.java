import java.util.*;
class InsertionsortPractice
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
		insertionSort(arr,n);
		printArray(arr,n);
		
	}
	public static void insertionSort(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int current = arr[i];
			int j=i-1;
			while(j >= 0 && current < arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
	}
	public static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}