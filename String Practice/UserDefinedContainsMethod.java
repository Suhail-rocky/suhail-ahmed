import java.util.Scanner;
class UserDefinedContainsMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		System.out.println(contains(s));
	}
	
}