import java.util.Scanner;
public class ContainsMethodDemos
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		System.out.println("Enter a string to check :  ");
		String check=sc.next();
		boolean ans=s.contains(check);
		System.out.println(ans);
	}
}