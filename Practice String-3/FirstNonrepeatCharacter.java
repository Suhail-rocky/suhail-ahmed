import java.util.*;
public class FirstNonrepeatCharacter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		String temp="";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					c[i]=0;
					c[j]=0;
					
				}
			}
		}
		String ans = new String(c);
		char d[]=ans.toCharArray();
		for(int i=0;i<d.length;i++)
		{
			if(d[i]!= 0)
			{
				System.out.print(d[i]);
				break;
			}
		}
		/*System.out.println(new String(c));
		System.out.println(temp);*/
	}
}