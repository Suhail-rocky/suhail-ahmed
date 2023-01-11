/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = 7 1 5 3 6 4
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/
import java.util.*;
public class BuyAndSell
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of days :");
		int days=sc.nextInt();
		int prices[]=new int[days];
		for(int i=0;i<days;i++)
		{
			prices[i]=sc.nextInt();
		}
		int max=0,transactions=0;
		for(int i=0;i<days;i++)
		{
			for(int j=i+1;j<days;j++)
			{
				if(prices[i]<prices[j])
				{
					int ans =prices[i]-prices[j];
					if(ans < 0)
					{
						ans *=-1;
					}
					if(ans > max)
					{
						transactions++;
						max = ans;
					}
					if(transactions == 2)
					{
						break;
					}
				}
			}
		}
		System.out.println(max);
	}
}
 