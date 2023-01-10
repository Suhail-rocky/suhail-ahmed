import java.util.*;
public class Array3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		//int arr[] = new int[n];
		String arrs[] = new String[n];
/*System.out.println("Enter a int array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr,n);*/
	System.out.println("Enter a String array :");
		for(int i=0;i<n;i++)
		{
			arrs[i]=sc.next();
		}
		Strsort(arrs,n);
	}
	/*static  void sort(int arr[],int n)
	{
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		print(arr,n);
	}
	static void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}*/
	static void  Strsort(String arr[],int n)
	{
		String temp = null;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].compareTo(arr[j]))
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		print(arr,n);
	}
	static void  print(String  arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}