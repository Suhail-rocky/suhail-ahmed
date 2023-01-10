import java.util.*;
public class  RemoveDuplicates
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a no of array ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a Array :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j]=0;
					count++;
				}
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!= 0)
			{
				System.out.print(arr[i]+" ");
			}
			else
			{
				System.out.print("_ ");
			}
		}
			
				
	}
}