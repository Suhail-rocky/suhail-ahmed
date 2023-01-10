
import java.util.*;

class RotateArray {

	static void Rotate(int arr[], int d, int n)
	{
		int temp[] = new int[n];
		int k = 0;
		for (int i = d; i < n; i++) 
		{
			temp[k] = arr[i];
			k++;
		}

		for (int i = 0; i < d; i++) 
		{
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i < n; i++) 
		{
		arr[i] = temp[i];
		}
}

static void PrintTheArray(int arr[], int n)
{
	for (int i = 0; i < n; i++) 
	{
		System.out.print(arr[i]+" ");
	}
}
	public static void main (String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("How many rotation you want to rotate :");
		int d = sc.nextInt();
		Rotate(arr, d, n);
		PrintTheArray(arr, n);
	}
}

