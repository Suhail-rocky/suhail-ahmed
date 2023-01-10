import java.util.*;
public class InsertArray6
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
		System.out.println("Enter a element and index to be inserted :");
		int index = sc.nextInt();
		int no = sc.nextInt();
		System.out.println("Original Array : "+Arrays.toString(arr));       
		for(int i=arr.length-1; i > index; i--)
		{
			arr[i] =arr[i-1];
		}
		arr[index] = no;	
		System.out.println("Original Array : "+Arrays.toString(arr)); 
		}
	}