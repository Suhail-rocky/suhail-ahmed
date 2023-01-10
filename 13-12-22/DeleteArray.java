import java.util.*;
public class DeleteArray
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a array :");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter a array :");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter a position ");
	int position = sc.nextInt();
	for(int i=position-1;i<n-1;i++)
	{
		arr[i]=arr[i+1];
	}
	n--;
	for(int i=0;i<n;i++)
	{
			System.out.print(arr[i]+" ");
	}
}
}