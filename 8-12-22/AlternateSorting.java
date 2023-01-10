import java.util.*;
public class AlternateSorting
{
public static void main(String[] args)
{
	int temp = 0,i=0,j=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter a array :");
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		
	}
	for(i=0,j=n-1;i<j;i++,j--)
	{
		System.out.print(arr[i]+" "+arr[j]+" ");
	}
	if(n %2 != 0)
	{
		System.out.print(arr[i]);
	}	
	}
}
