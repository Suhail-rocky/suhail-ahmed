import java.util.*;
//Hill Pattern Decreasing Space Increasing Star Increasing Star 
class Pattern6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size :");
		int n = sc.nextInt();
		hillPattern(n);
	}
	static void hillPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int k=n;k>i;k--)//Decreasing Space
			{
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++)//Increasing Star
			{
				System.out.print("* ");
			}

			for(int j=0;j<=i;j++)//Increasing Star 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}