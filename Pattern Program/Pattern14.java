import java.util.*;
//Hollow Triangle Pattern
class Pattern14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size :");
		int n = sc.nextInt();
		hollowTrianglePattern(n);
	}
	static void hollowTrianglePattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				//System.out.print("*");
				if(i==n-1|| j==0 || j==i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}