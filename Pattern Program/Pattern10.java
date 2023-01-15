import java.util.*;
//Hollow Square pattern
class Pattern10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int n = sc.nextInt();
		hollowSquarepattern(n);	
	}
	static void hollowSquarepattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
