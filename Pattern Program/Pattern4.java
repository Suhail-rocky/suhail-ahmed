import java.util.*;
//Right sided Triangle
class Pattern4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int n = sc.nextInt();
		rightSidedtriangle(n);
	}
	static void rightSidedtriangle(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)//decreasing space
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)//increasing star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
		}
	}
