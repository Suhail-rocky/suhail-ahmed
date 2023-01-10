import java.util.*;
public class Doubt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		if(n%2 == 0)
		{
			System.out.println(arr[n/2]);
		}
		else
		{
			System.out.println(arr[(n+1)/2]);
		}
	}
}