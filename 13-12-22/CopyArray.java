import java.util.*;
public class CopyArray
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n = sc.nextInt();
	int arr[] = new int[n];
	int copy[] = new int[n];
	System.out.println("Enter a array :");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		copy[i]=arr[i];
	}
	
	for(int i=0;i<n;i++)
	{
		System.out.print(copy[i]+" ");
	}
	
}
}
