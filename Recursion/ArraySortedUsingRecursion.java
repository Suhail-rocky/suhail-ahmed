import java.util.*;
class ArraySortedUsingRecursion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean ans = isSorted(arr,0);
		System.out.println(ans);
	}
	public static boolean isSorted(int arr[],int i)
	{
	if(i == arr.length-1)
		return true;
	if(arr[i]<arr[i+1])
		return isSorted(arr,i+1);
	return false;
	}
}