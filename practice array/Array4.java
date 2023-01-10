import java.util.*;
public class Array4{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to find : ");
		int search = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i] == search)
			{
				System.out.println(arr[i]);
				System.out.println(i);
				arr[i]=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println(arr[i]+" ");
			}
		}
		
	}
}