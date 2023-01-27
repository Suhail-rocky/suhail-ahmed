import java.util.*;
class DeleteAnElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		delete(arr,n);
	}
	public static void delete(int arr[],int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element to delete");
		int pos = sc.nextInt();
		for(int i=pos;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//System.out.println(Arrays.toString(arr));
	}		
}