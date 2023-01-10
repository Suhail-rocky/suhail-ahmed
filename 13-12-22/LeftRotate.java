import java.util.*;
public class LeftRotate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to left rotate :");
		int rotate = sc.nextInt();
		for(int i=rotate;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<rotate;i++)
		{
			System.out.print(arr[i]+" ");
		}
			
	}
}