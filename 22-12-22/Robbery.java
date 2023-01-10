import java.util.*;
public class Robbery
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0,sum1=0,num=0;
		System.out.println("Enter a no of houses :");
		int n = sc.nextInt();
		int rob[] = new int[n];
		System.out.println("Enter a houses :");
		for(int i=0;i<n;i++)
		{
			rob[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			num = sum + rob[i];
			sum=sum>sum1?sum:sum1;
			sum1=num;
		}
		int result = (sum > sum1)?sum:sum1;
		System.out.println(result);
	
	}
}