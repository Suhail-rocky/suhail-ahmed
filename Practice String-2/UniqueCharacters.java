import java.util.*;
public class UniqueCharacters
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					c[j]=0;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 0)
			{
				count++;
				System.out.print(c[i]+"");
			}
		}
		System.out.println(count);
	}
}