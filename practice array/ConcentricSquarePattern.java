import java.util.*;
public class ConcentricSquarePattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of size :");
		int n = sc.nextInt();
		int arr[][]=new int[n][n];
		int l=0,r=n-1;
		int copy=n;
		while(l<n)
		{
			for(int i=l;i<=r;i++)
			{
				for(int j=l;j<=r;j++)
				{
					if(i==l||i==r||j==l||j==r)
					{
						arr[i][j]=n;
					}
				}
			}
			n--;
			l++;
			r--;
		}
		for(int i=0;i<copy;i++)
		{
			for(int j=0;j<copy;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}