import java.util.*;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.println(fact(n,1));
	}
	private static int fact(int n,int ans)
	{
		if(n == 0)
			return ans;
		return fact(n-1,ans*n);
	}
}