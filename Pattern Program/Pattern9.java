import java.util.*;
//Square Patterns
class Pattern9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size :");
		int n = sc.nextInt();
		squarePattern(n);
	}
	static void squarePattern(int n)
	{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	
}