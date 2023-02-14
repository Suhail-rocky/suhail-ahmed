import java.util.*;
public class UserDefinedSplitMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		System.out.println("Enter a letter to split : ");
		String spl=sc.nextLine();
		System.out.println(split(s,spl));
	}
	public static ArrayList<String> split(String s,String spl)
	{
		char c[]=s.toCharArray();
		char sp[]=spl.toCharArray();
		String word="";
		ArrayList<String> str = new ArrayList<String>();
		int x=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==sp[0])
			{
				str.add(word);
				word="";
			}
			else
			{
				word += c[i];
			}
		}
		return str;
	}
}