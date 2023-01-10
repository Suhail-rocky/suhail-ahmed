import java.util.*;
public class CheckStr{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count=0,check=0;
		String word ="";
		System.out.println("Enter a String :");
		String s1 = sc.nextLine();
		System.out.println("Enter a String to want to check  From :");
		String s2 = sc.next();
		System.out.println("Enter a String to want to check To  :");
		String s3= sc.next();
		char c[] =s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
				word+=c[i];
				
			}
			else
			{
				if(!(word.equals(s2)))
				{
					count++;
				}
				else
				{
					
					check=count;
				}
				word="";
			}
		}
		if(check != 0)
		{
			System.out.println(check);
		}
		else{
			System.out.println("-1");
		}
	}
}