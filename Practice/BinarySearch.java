import java.util.Scanner;
class BinarySearch
//Eval-1 QP HR Batch-2 21-07-2022
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a target : ");
		int target=sc.nextInt();
		int ans=findIndex(arr,target);
		System.out.println(ans);
		
	}
	public static int findIndex(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start + end)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				start=mid+1;
			else
				end = mid-1;
		}
		return end+1;
	}
}