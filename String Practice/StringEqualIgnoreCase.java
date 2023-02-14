import java.util.Scanner;
class StringEqualIgnoreCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String-1 : ");
		String s1=sc.next();
		System.out.println("Enter a String-2 : ");
		String s2=sc.next();
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}