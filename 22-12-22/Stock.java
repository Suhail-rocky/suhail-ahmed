import java.util.*;
public class Stock
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a no of prices :");
		int n = sc.nextInt();
		int prices[] = new int[n];
		System.out.println("Enter a prices :");
		for(int i=0;i<n;i++)
		{
			prices[i]=sc.nextInt();
		}
		System.out.println("Enter a no of transaction :");
		int k=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			if(prices[i]<prices[i+1])
			{
				k--;
				sum+=prices[i+1]-prices[i];
				i++;
			}
			if(k==0)
				break;
		}
		System.out.println(sum);
}
}