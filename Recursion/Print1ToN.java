import java.util.*;
class Print1ToN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers to print");
		int n = sc.nextInt();
		print(n);
	}
	public static void print(int n)
	{
		if(n == 0)
			return;
		print(n-1);
		System.out.println(n);
	}
}