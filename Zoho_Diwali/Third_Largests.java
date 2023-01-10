

import java.util.*;
public class Third_Largests
{
static void thirdLargest(int arr[], int arr_size)
{

	int first = arr[0];
	for (int i = 1;i < arr_size ; i++)
		if (arr[i] > first)
			first = arr[i];
	int second = Integer.MIN_VALUE;
	for (int i = 0;i < arr_size ; i++)
		if (arr[i] > second && arr[i] < first)
			second = arr[i];

	int third = Integer.MIN_VALUE;
	for (int i = 0;i < arr_size ; i++)
		if (arr[i] > third && arr[i] < second){
			third = arr[i];
			System.out.printf("The third Largest " + "element is %d\n", third);
	}
	else if (arr_size < 3)
	{
	System.out.println("-1");
	break;
	}
	
}

public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	arr[i] = sc.nextInt();
	n = arr.length;
	thirdLargest(arr, n);
}
}

// This code is contributed
// by Smitha
