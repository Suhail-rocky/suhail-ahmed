import java.util.Scanner;
class ContainsMethodDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		System.out.println("Enter a word to check ");
		String word = sc.next();
		System.out.println(s.contains(word));
	}
}