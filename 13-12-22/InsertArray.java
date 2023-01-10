import java.util.*;
public class InsertArray
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n = sc.nextInt();
	System.out.println("Enter a array :");
	int arr[] = new int[n++];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	System.out.println("Enter a Position :");
	int position = sc.nextInt();
	System.out.println("Enter a value :");
	int value = sc.nextInt();
	for(int i=n;i>=position;i--)
	{
		arr[i]=arr[i-1];
		
	}
	arr[position-1]=value;
	n++;
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
		
	}	
	}
}
