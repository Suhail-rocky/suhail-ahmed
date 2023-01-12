import java.util.*;
public class SumtwoString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - 1");
		String s1 = sc.next();
		int a=strTonum(s1);
		System.out.println("Enter a String - 2");
		String s2 = sc.next();
		int b =strTonum(s2);
		int c = a+b;
		String temp ="";
		temp += c;
		System.out.println("Addition of two Strings ");
		System.out.println(temp);
	}
	static int strTonum(String s)
	{
		int num = 0;
		for(int i=0;i<s.length();i++)
			num = num * 10 + s.charAt(i)-48;
		return num;
	}
}