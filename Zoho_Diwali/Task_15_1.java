import java.util.*;
public class Task_15_1{
	static int temp = 0;
	static void findMissing(int arr[],int n)
	{
		int i;
		int temp [] = new int[n+1];
		for(i = 0;i <= n; i++)
		{
			temp[i] = 0;
		}
		for(i = 0;i < n; i++)
		{
			temp[arr[i] - 1] = 1;
		}
		int ans =0;
		for(i = 0; i <= n; i++)
		{
			if(temp[i] == 0)
				ans = i + 1;
		}
		System.out.println(ans); 
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		System.out.println("Enter a array :");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		findMissing(arr,n);
		
	}
}