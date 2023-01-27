import java.util.*;
class MoveallToEnd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println("Enter a letter to move to End :");
		char m = sc.next().charAt(0);
		char c[]=s.toCharArray();
		String temp="",temp1="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=m)
			{
				temp+=c[i];
			}
			else if(c[i]==m)
			{
				temp1+=c[i];
			}
		}
		System.out.println(new String(temp+temp1));
		move(s,m,"","",0);
	}
	static void move(String s,char m,String temp1,String temp2,int i)
	{
		if(i == s.length())
		{
			System.out.println(temp2+temp1);
			return;
		}
		char c=s.charAt(i);
		if(c != m)
			move(s,m,temp1,temp2+c,i+1);
		else if(c == m)
			move(s,m,temp1+c,temp2,i+1);
	}
}