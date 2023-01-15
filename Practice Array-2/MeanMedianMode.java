import java.util.*;
public class MeanMedianMode
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		//System.out.println(sum);
		int Mean = sum/n;
		System.out.println(Mean);
			if(arr.length % 2 != 0)
			{
				System.out.println(arr[arr.length/2]);
				
			}
			else
			{
				System.out.println(arr[arr.length/2]+arr[arr.length/2-1]/2.0);
			}
			//mode
			int visited=-1;
			int freq[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i] != visited)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(freq[i] != visited)
			{
				System.out.println(arr[i]+" "+freq[i]);
				
			}
		}
	}
}
