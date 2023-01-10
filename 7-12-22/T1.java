import java.util.*;
public class T1
{
public static void main(String[] args)
{
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter a no of array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
		for(int i=0;i<n/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=n/2;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
}
}