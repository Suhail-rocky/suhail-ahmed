import java.util.*;
class RemoveDuplicates
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		removeDuplicates(arr,n);
	}
	public static void removeDuplicates(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j]=0;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
				System.out.print(arr[i]+" ");
		}
		System.out.println(Arrays.toString(arr));
	}
}