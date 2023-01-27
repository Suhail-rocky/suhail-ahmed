import java.util.Scanner;
class Power
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and power number :");
		int m=sc.nextInt();
		int n=sc.nextInt();
		printPower(m,n);
		System.out.println(printPowerrec(m,n,1));
	}
	public static void printPower(int m,int n)
	{
		int sum = 1;
		for(int i=0;i<n;i++)
		{
			sum = sum * m;
		}
		System.out.println(sum);
	}
	public static int printPowerrec(int m,int n,int sum)
	{
		if(n==0)
			return sum;
		return printPowerrec(m,n-1,sum*m);
	}
}