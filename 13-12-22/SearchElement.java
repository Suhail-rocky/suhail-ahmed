import java.util.*;
public class SearchElement
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
		System.out.println("Enter a Element you want to search :");
		int search = sc.nextInt(); 	
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Element found at index :"+i);
			}
		}
		
	}
	
}