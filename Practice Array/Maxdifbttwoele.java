/*Input : arr = {2, 3, 10, 6, 4, 8, 1}
Output : 8
Explanation : The maximum difference is between 10 and 2.

Input : arr = {7, 9, 5, 6, 3, 2}
Output : 2
Explanation : The maximum difference is between 9 and 7.*/
import java.util.*;
public class Maxdifbttwoele
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int ans = arr[i]-arr[j];
					if(ans < 0)
					{
						ans *=-1;
					}
					if(ans > max)
					{
						max = ans;
					}
				}
			}
		}
		System.out.println(max);
		System.out.println(Arrays.toString(arr));
		

}
}