import java.util.*;
public class leftrot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int last;
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a position :");
		int position = sc.nextInt();
		for(int i=0;i<position;i++)
		{
			last = arr[n-1];
				for(int j = n-1;j>0;j--)
				{
					arr[j] = arr[j-1];
				}
				arr[0] = last;
		}
		System.out.println(Arrays.toString(arr));
	}
}