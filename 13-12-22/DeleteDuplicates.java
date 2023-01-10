import java.util.*;
public class DeleteDuplicates
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n = sc.nextInt();
	int count = 0;
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		
		for(int j=i+1;j<n;j++)
		{
			if(arr[i] == arr[j])
			{
				arr[j]=0;
				break;
			}
		}
		if(arr[i] != 0)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
}


