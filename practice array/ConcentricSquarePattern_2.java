import java.util.*;
public class ConcentricSquarePattern_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of size :");
		int n = sc.nextInt();
		int variable=2*n-1;
		int arr[][]=new int[variable][variable];
		int l=0,r=variable-1;
		int copy=n;
		while(n!=0)
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
		for(int i=0;i<variable;i++)
		{
			for(int j=0;j<variable;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}