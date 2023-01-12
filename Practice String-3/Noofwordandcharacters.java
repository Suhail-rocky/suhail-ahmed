import java.util.*;
public class Noofwordandcharacters
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		s+=" ";
		char c[]=s.toCharArray();
		String word="";
		int count=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
				word+=c[i];
				count++;
			}
			else
			{
				System.out.println(word+" - "+count);
				word="";
				count=0;
			}
		}
		
	}
}