import java.util.*;
public class MaxNumber
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
		int max=arr[0],min = arr[0];;
		for(int i=1;i<n;i++)
		{
			
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.print("maximum no is "+max+" ");
		System.out.print("minimum no is "+min);
		
		
		
	}
}