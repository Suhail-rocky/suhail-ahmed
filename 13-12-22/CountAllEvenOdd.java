import java.util.*;
public class CountAllEvenOdd{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n =sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter a array :");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int even=0,odd=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]%2 == 0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	System.out.println("Even is "+even);
	System.out.println("Odd is "+odd);
}
}
