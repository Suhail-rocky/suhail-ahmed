import java.util.*;
public class T2{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int temp=0;
	System.out.println("Enter a no of array :");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int max = arr[arr.length-1]-arr[0];
	System.out.println(max);
	int min = arr[1]-arr[0];
	System.out.println(min);
}
}
