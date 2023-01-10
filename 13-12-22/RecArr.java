import java.util.*;
public class RecArr
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		arrayInput(arr,n,0);
		System.out.println("Array of the elements are  :");
		arrayoutput(arr,n,0);
	}
	public static void arrayInput(int []arr,int n,int i)
	{
		if(i == n)
			return;
		
		arr[i] = sc.nextInt();
		arrayInput(arr,n,i+1);
	}
	
	public static void arrayoutput(int []arr,int n,int i)
	{
		if(i == n)
			return;
		
		System.out.print(arr[i]+" ");
		arrayoutput(arr,n,i+1);
	}
}