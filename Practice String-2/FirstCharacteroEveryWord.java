import java.util.*;
public class FirstCharacteroEveryWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		s+=" ";
		String temp="";
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=32)
			{
				temp +=c[i];
			}
			else
			{
				char t[]=temp.toCharArray();
				System.out.println(t[0]);
				temp="";
			}
		}
	}
}
