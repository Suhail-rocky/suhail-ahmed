import java.util.*;
public class DeleteArray5
{
	public static void main(String[] args)
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
		System.out.println("Enter a index value to delete :");
		int delete = sc.nextInt();
		for(int i=delete;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];

		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}