import java.util.*;
public class ReplaceCharacterInString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		char c[] = s.toCharArray();
		System.out.println("Enter a Character  to change to : ");
		char r=sc.next().charAt(0);
		char change=sc.next().charAt(0);
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == r)
			{
				c[i]=change;
			}
		}
		String ans = new String(c);
		System.out.println(ans);
	}
}