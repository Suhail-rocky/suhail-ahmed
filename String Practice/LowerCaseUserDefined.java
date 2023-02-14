import java.util.Scanner;
class LowerCaseUserDefined
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		String res=toLowerCase(s);
		System.out.println(res);
	}
	public static String toLowerCase(String s)
	{
		char c[]=s.toCharArray();
		String temp = "";
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >= 'A' && c[i] <= 'Z')
			{
				temp += (char)((int)c[i]+32);
			}
			else
			{
				temp += c[i];
			}
		}
		return temp;
	}
}