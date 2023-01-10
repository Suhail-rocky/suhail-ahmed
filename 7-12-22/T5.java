import java.util.*;
public class T5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a Array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		T5 t = new T5();
		t.rotateArray(arr,n);
		
	}
	public void rotateArray(int arr[],int n)
	{
		int x=arr[arr.length-1],i;
		for(i=arr.length-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0]=x;
		print(arr,n);
	}
	public void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}