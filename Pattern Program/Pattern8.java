import java.util.*;
// Diamond-Hill Pattern + Reverse Hill Pattern
// Hill Pattern =  Decreasing space + increasing star + increasing star
// Reverse Hill Pattern=Increased Space + Decreased star + Decreased Star

class Pattern8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int n = sc.nextInt();
		diamond(n);
	}
	static void diamond(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}