import java.util.*;
/* Reverse Hill Pattern
Increasing Space
Decreasing Triangle
Decreasing Triangle
*/ 
class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size :");
		int n=sc.nextInt();
		reverseHill(n);
	}
	static void reverseHill(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//Increasing Space
			{
				System.out.print("  ");
			}
			for(int k=i;k<n;k++)//Decreasing Star
			{
				System.out.print("* ");
			}
			for(int k=i;k<=n;k++)//Decreasing Star
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}