import java.util.Scanner;
public class UserDefinedSubString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		System.out.println(subString(s,2,5));
		System.out.println(subStrings(s,1));
		
	}
	public static String subString(String s,int si,int ei)
	{
		char c[]=s.toCharArray();
		String temp = "";
		for(int i=si;i<ei;i++)
		{
			temp+=c[i];
		}
		return temp;
	}
	public static String subStrings(String s,int index)
	{
		char c[]=s.toCharArray();
		String temp="";
		for(int i=index;i<s.length();i++)
		{
			temp += c[i];
		}
		return temp;
	}
}