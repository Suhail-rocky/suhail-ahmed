import java.util.Scanner;
class ZohoFail4
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
		System.out.println(equilibrium(arr,n));
	}
	public static int equilibrium(int arr[],int n)
	{
		int i,j,leftsum,rightsum;
		for(i=0;i<n;i++)
		{
			leftsum=0;
			rightsum=0;
			for(j=0;j<i;j++)
			{
				//System.out.println("array of left  elements : "+arr[j]);
				leftsum += arr[j];
			}
			for(j=i+1;j<n;j++)
			{
				//System.out.println("array of right elements : "+arr[j]);
				rightsum += arr[j];
			}
			if(leftsum == rightsum)
			{
				//System.out.println("LeftSum : "+leftsum);
				//System.out.println("RightSum : "+rightsum);
				return i;
			}
		}
		return -1;
	}
}