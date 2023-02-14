import java.util.Scanner;
class UserDefinedTrimMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		String ans = trim(s);
		System.out.println("-"+ans+"-");
	}
	public static String trim(String s)
	{
		char c[]=s.toCharArray();
		String temp="";
		int first=0,last=0;
		for(int i=0;i<s.length();i++)
		{
			if(c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z')
			{
				first=i;
				break;
			}
		}
		for(int j=s.length()-1;j>0;j--)
		{
			if(c[j] >= 'a' && c[j] <= 'z' || c[j] >= 'A' && c[j] <= 'Z')
			{
				last=j;
				break;
			}
		}
		for(int i=first;i<=last;i++)
		{
			temp += c[i];
		}
		return temp;
	}
}