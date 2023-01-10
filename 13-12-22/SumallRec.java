import java.util.*;
public class SumallRec
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]= new int[n];
		int sum = Sum(arr,n,0,0);	
		System.out.println(sum);
	}
	private static int Sum(int arr[],int n,int i,int sum)
	{
		if(i==n)
			return sum;
		arr[i]=sc.nextInt();
		return Sum(arr,n,i+1,sum+arr[i]);
		
	}
}
