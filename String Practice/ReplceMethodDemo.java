import java.util.Scanner;
class ReplceMethodDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		System.out.println("Enter a old letter with new letter ");
		char old=sc.next().charAt(0);
		char news=sc.next().charAt(0);
		String replce=s.replace(old,news);
		System.out.println(replce);
	}
}