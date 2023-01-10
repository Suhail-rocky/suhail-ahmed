/*nput: {1, 5, 3, 19, 18, 25}
Output: 1
Explanation: Minimum difference is between 18 and 19

Input: 30 5 20 9
Output: 4
Explanation: Minimum difference is between 5 and 9

Input: 1 19 -4 31 38 25 100
Output: 5
Explanation: Minimum difference is between 1 and -4
*/
import java.util.*;
public class Mindifbttwoele
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
		int min='-';
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int ans = arr[i]-arr[j];
					if(ans < 0)
					{
						ans *=-1;
					}
					if(ans < min)
					{
						min = ans;
					}
				}
			}
		}
		System.out.println(min);
		System.out.println(Arrays.toString(arr));
		

}
}