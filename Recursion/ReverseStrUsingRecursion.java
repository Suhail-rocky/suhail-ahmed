import java.util.Scanner;
class ReverseStrUsingRecursion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		System.out.println(reverse(s,"",s.length()-1));
	}
	public static String reverse(String s,String rev,int i)
	{
		if(i==0)
		{
			return rev+s.charAt(i);
		}
		char c = s.charAt(i);
		return reverse(s,rev+c,i-1);
	}
}