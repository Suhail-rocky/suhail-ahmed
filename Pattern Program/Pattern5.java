import java.util.*;
//Right Side Triangle-2
//Increasing space Decreasing Star
class Pattern5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		rightSideTriangle2(n);
	}
	static void rightSideTriangle2(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			
				
			System.out.println();
		}
	}
}