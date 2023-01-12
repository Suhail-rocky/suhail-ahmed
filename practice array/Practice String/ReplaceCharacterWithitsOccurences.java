import java.util.*;
public class ReplaceCharacterWithitsOccurences
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		System.out.println("Enter  a Character to see Occurence :");
		char occ=sc.next().charAt(0);
		int count = 1;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==occ)
				{
					c[i]=(char)(count+'0');
					count++;
				}
		}
		System.out.println(new String(c));
	}
}