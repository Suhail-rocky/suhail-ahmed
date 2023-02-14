import java.util.Scanner;
class StringCompare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String-1 : ");
		String s1 = sc.next();
		System.out.println("Enter a String-2 : ");
		String s2 = sc.next();
		String s3 = new String("suhail");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
	}
}