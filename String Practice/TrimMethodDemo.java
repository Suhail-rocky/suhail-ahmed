import java.util.Scanner;
public class TrimMethodDemo
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		String ans = s.trim();
		System.out.println("After removing space"+ans+"---");
	}
}