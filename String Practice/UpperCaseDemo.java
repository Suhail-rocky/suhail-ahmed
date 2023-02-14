import java.util.Scanner;
public class UpperCaseDemo
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		System.out.println(s.toUpperCase());
	}
}