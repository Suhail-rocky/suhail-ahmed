/*Given an array, print the Next Greater Element (NGE) for every element. 

The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 

Example: 

Input: arr[] = [ 4 , 5 , 2 , 25 ]
Output:  4      –>   5
               5      –>   25
               2      –>   25
              25     –>   -1
Explanation: except 25 every element has an element greater than them present on the right side

Input: arr[] = [ 13 , 7, 6 , 12 ]
Output:  13      –>    -1
                7       –>     12
                6       –>     12
               12      –>     -1
Explanation: 13 and 12 don’t have any element greater than them present on the right side

*/
import java.util.Scanner;
class ZohoFail1 {
	
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
			System.out.println(arr[i] + " -- " + next);
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		printNGE(arr, n);
	}
}
