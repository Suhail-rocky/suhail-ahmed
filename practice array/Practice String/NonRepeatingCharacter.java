import java.util.*;
public class NonRepeatingCharacter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
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
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 0)
			{
				System.out.print(c[i]+"");
			}
		}
		//System.out.println(new String(c));
	}
}