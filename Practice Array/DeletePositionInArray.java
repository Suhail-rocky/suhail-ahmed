import java.util.*;
public class DeletePositionInArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a position to Delete :");
		int index = sc.nextInt();
		for(int i=index;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(Arrays.toString(arr));
	}
}