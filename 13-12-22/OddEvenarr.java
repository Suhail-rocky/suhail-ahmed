import java.util.*;
public class OddEvenarr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int even[]=new int[n];
		int odd[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(arr[i] %2 == 0)
			{
				even[i]=arr[i];
			}
			else
			{
			odd[i]=arr[i];
			}
		}
		System.out.println("The Even array are :");
		for(int i=0;i<n;i++)
		{
			if(even[i]!=0)
			{
				System.out.print(even[i]+" ");
			}
		}
		System.out.println();
		System.out.println("The Odd array are :");
		for(int i=0;i<n;i++)
		{
			if(odd[i]!= 0)
			{
				System.out.print(odd[i]+" ");
			}
		}
	}
}
		
			
		
	
