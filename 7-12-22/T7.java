import java.util.*;
public class T7{
public static void main(String[] args)
{
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n= sc.nextInt();
	System.out.println("Enter a array :");
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println("Enter a Sum :");
	int sum = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]+arr[j] == sum)
			{
				count++;
			}
		}
	}
	System.out.println(count);
}
}