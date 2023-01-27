import java.util.*;
class SumOfFirstNaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.println(sum(n,0));
	}
	public static int sum(int n,int s)
	{
		if(n == 0)
			return s;
		return sum(n-1,s+n);
	}
}
