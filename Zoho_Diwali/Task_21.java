import java.util.*;
public class Task_21
	{
	static int n;
	static void print_Element(int arr[], int n)
	{
		System.out.print(arr[0]+" ");
		for(int i = 1; i < n - 1; i++)
		{
			if(arr[i] > arr[i-1])
				System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array :");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		print_Element(arr,n);
	}
}