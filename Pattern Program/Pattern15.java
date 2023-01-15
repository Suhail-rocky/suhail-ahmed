import java.util.*;
//Hollow Decreasing triangle
class Pattern15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size :");
		int n = sc.nextInt();
		hollowDecreasingTriangle(n);
	}
	static void hollowDecreasingTriangle(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(i == 1 || j == i || j == n )
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
