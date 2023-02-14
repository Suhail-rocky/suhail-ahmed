import java.util.Scanner;
public class CharAtDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		System.out.println(s.charAt(1));
		System.out.println(charAt(s,1));
	}
	public static char charAt(String s,int index)
	{
		char c[]=s.toCharArray();
		char ans=c[index];
		return ans;
	}
}