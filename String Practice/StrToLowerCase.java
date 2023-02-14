import java.util.Scanner;
class StrToLowerCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s =sc.next();
		String lwr=s.toLowerCase();
		System.out.println(lwr);
	}
}