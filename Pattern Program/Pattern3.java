import java.util.*;
//Decreasing triangle pattern
class Pattern3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size : ");
		int n = sc.nextInt();
		decreasingTrianglepattern(n);
	}
	static void decreasingTrianglepattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}