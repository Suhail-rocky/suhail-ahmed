import java.util.*;
public class MinimumNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int min='-';
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i] < min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum no is "+min);
	}
}