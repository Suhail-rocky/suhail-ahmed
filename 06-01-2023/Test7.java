import java.util.*;
public class Test7
{
	public static void main(String[] args)
	{
		int count=0;
		String temp="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		boolean flag[]=new boolean[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(flag[i] != true)
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					flag[j] = true;
		
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(flag[i] != true)
			{
				temp+=c[i];
				count++;
			}
		}
		System.out.println("The answer is "+temp+", with the length of "+count);
		
	}
}