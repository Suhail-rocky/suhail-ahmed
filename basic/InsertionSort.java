import java.util.*;
public class InsertionSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array : ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=1;j<n;j++)
		{
			int key=arr[j];
			int i=j-1;
			while( i > -1 && arr[i] > key)
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
}