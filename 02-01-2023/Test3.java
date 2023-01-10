import java.util.*;
public class Test3
{
	public static void main(String[] args)
	{
		String temp="";
		int palindrome=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0;i<s.length();i++)
		{
			temp += s.charAt(i);
			int res = reverse(temp);
		
			if(res == 1)
			{
				palindrome++;
				res=0;
				temp="";
			}
	}
			if(palindrome>1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
	}
		static int reverse(String temp)
		{
			String temp2 = "";
			char r[]=temp.toCharArray();
			for(int i=r.length-1;i>0;i--)
			{
				temp2+=r[i];
			}
			if(temp.equals(temp2)&&temp2.length()>1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
			
		}
		}
	
