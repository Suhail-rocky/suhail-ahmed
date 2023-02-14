import java.util.Scanner;
public class UserDefinedIsEmpty
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s="";
		System.out.println(isEmpty(s));
	}
	public static boolean isEmpty(String s)
	{
		if(s.length() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}