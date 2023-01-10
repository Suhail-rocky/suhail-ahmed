import java.util.*;
public class SecondMaxNumber
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=arr[0],smax=0;
		for(int i=1;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=1;i<n;i++)
		{
			if(arr[i]<max)
			{
				smax=arr[i];
			}
		}
		
		System.out.print("maximum no is "+smax);
		
		
		
		
	}
}