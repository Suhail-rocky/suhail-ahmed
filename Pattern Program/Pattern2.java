import java.util.*;
//Increased Triangle Pattern
class Pattern2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size ");
		int n = sc.nextInt();
		increasedTrianglepattern(n);	
	}
	static void increasedTrianglepattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}