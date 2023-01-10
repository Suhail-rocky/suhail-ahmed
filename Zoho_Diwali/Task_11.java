import java.util.*;
public class Task_11{
	public static void main(String[] args)
	{
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array : ");
		int n = sc.nextInt();
		System.out.println("Enter a array : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Maximum Product is "+arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]);
	}
}
					
