import java.util.*;
public class Test6
{
	public static void main(String[] args)
	{
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a height of tower :");
		int height = sc.nextInt();
		int height2=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k] == height)
					{
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
						System.out.print(" & ");
						break;
					}
					
					if(arr[i]+arr[j]+arr[k] == height2)
					{
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
						break;
					}
				}
			}
		}
	}
}
		
