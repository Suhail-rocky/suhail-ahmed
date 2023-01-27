// Simple Java program to print next
// greater elements in a given array
import java.util.*;
class NextGreatestElements {
	static void printNGE(int arr[], int n)
	{
		int next, i, j;
		for (i = 0; i < n; i++) {
			next = -1;
			for (j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.print(arr[i] + " ->" + next+" ");
		}
		System.out.println();
	}

	public static void main(String args[])
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
		printNGE(arr, n);
	}
}
