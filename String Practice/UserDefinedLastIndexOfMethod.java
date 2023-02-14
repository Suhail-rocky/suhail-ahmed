import java.util.Scanner;
public class UserDefinedLastIndexOfMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		System.out.println("Enter a String to find : ");
		String find=sc.next();
		int ans=lastIndexOf(s,find);
		System.out.println(ans);
		
	}
	public static int lastIndexOf(String s,String find)
	{
		char c[]=s.toCharArray();
		char f[]=find.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			if(f[0]==c[i])
				return i;
		}
		return -1;
	}
	
}