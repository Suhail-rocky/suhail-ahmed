import java.util.*;
public class ReverseEachWord
{
	public static void main(String[] args)
	{
		String ans="";
		String res="";
		String temp="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s= sc.nextLine();
		s+=" ";
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
				temp += c[i];
			}
			else
			{
				String reverse=temp;
				char rev[]=reverse.toCharArray();
				for(int j=rev.length-1;j>=0;j--)
				{
					ans += rev[j];
				}
				ans += " ";
				res +=ans;
				ans="";
				temp="";
				
			}
		}
		System.out.println(res);
	}
}