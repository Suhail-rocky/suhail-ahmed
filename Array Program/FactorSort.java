import java.util.*;
class FactorSort
{	
	static int x=0;
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
		int freq[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int factor=arr[i];
			int count=0;
			for(int j=1;j<=factor;j++)
			{
				if(factor%j == 0)
				{
					count++;
				}
			}
			freq[i]=count;
		}
		sort(freq);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(freq));
	}
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
}