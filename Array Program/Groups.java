import java.util.Scanner;
class Groups
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a divisible value : ");
		int dv=sc.nextInt();
		int sum=0,sum1=0,count=0;;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=arr[i]+arr[j];
				if(sum % dv == 0)
				{
					System.out.println(arr[i]+","+arr[j]);
					count++;
				}
				for(int k=j+1;k<n;k++)
				{
					sum1=arr[i]+arr[j]+arr[k];
					if(sum1 % 3 == 0)
					{
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}