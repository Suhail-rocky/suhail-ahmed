import java.util.*;
public class LeaderArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=i+1;j<n;j++)
			{
				if(arr[i] <= arr[j])
				{
					break;
				}
			}
			if(j == n)
			{
				System.out.println(arr[i]+" ");
			}
		}
		
	}
}