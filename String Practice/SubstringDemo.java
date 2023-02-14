import java.util.Scanner;
public class SubstringDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a String :");
		String s=sc.next();
		System.out.println("Enter a index to start from : ");
		int i=sc.nextInt();
		String ans = s.substring(i);
		System.out.println("Enter a index to from to end : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String answer=s.substring(a,b);
		System.out.println(ans+" "+answer);
	}
}