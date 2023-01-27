import java.util.*;
class Fibonacci
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		fibo(0,1,n);
	}
	private static void fibo(int a,int b,int n)
	{
		if(n == 0)
			return;
		System.out.println(a);
		fibo(b,a+b,n-1);
	}
}