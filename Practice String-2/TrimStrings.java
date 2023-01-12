import java.util.*;
public class TrimStrings
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		int count=0,start=0,end=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
				start=i;
				break;
			}
		}
		for(int i=c.length-1;i>=0;i--)
		{
			if(c[i] != 32)
			{
				end=i;
				break;
			}
			
		}
		count = end-start+1;
		String ans = new String(c,start,count);
		System.out.println(ans);
		
	}
}