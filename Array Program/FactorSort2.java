import java.util.*;
class FactorSort2
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int freqs[]=new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(findfactor(arr[i])<findfactor(arr[j]))
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int findfactor(int factor)
	{
			int count=0;
			for(int j=1;j<=factor;j++)
			{
				if(factor%j == 0)
				{
					count++;
				}
			}
			
		return count;
	}
		
	}
	
