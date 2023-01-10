import java.util.*;
public class PrintallNegative
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int negative = 0;
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		System.out.println("Negative array numbers are :");
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");
				negative++;
			}
		}
		System.out.println(negative);
		
	}
}
