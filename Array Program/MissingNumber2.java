import java.util.*;
class MissingNumber2
{
	public static int getMissingNo(int arr[],int n)
	{
		int sum =((n+1)*(n+2))/2;
		for(int i=0;i<n;i++)
		{
			sum -= arr[i];
			return sum;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(getMissingNo(arr,n));
	}
}