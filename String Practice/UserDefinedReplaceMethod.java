import java.util.Scanner;
class UserDefinedReplaceMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		System.out.println("Enter a old word with new word that want to replace");
		char old=sc.next().charAt(0);
		char news=sc.next().charAt(0);
		String replaces=replace(s,old,news);
		System.out.println(replaces);
	}
	public static String replace(String s,char old,char news)
	{
		char c[]=s.toCharArray();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			
			if(c[i] == old)
			{
				temp +=news;
			}
			else
			{
				temp += c[i];
			}
		}
		return temp;
	}
}