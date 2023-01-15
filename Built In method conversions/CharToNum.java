import java.util.*;
public class CharToNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char c=sc.next().charAt(0);
		System.out.println("Enter a number to convert");
		int n = sc.nextInt();
		c=(char)(n+'0');
		System.out.println(c);
	}
}