import java.util.Scanner;
class DuplicateNumber
{
	public static  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array :  ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		findDuplicates(arr,n);
	}
	public static void findDuplicates(int arr[],int n)
	{
		int visited=-1;
		int freq[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					freq[j]=visited;
					count++;
				}
				
			}
				if(freq[i] != visited)
				{
					freq[i]=count;
				}
		}
		for(int i=0;i<n;i++)
		{
			if(freq[i] != -1)
			{
			System.out.println(arr[i]+"-"+freq[i]);
			}
		}
	}
}