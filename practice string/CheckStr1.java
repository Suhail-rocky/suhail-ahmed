import java.util.*;
public class CheckStr1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp="",word="";
		int count=0,result=0;
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		System.out.println("Enter a word 1:");
		String s2= sc.next();
		System.out.println("Enter a word 2:");
		String s3= sc.next();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >= 33 && c[i] <= 63 )
			{
				c[i]=0;
			}
			temp+=c[i];
		}
		System.out.println(temp);
		temp+=" ";
		char t[] = temp.toCharArray();
		for(int i=0;i<t.length;i++)
		{
			if(t[i]!=32)
			{
				word+=t[i];
			}
			else
			{
				System.out.println(word);
				if(word.equals(s2))
				{
						count++;
						if(word.equals(s3))
						{
							count = result;
						}
				}
				word="";
			}
		}
			if(result == 0)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(result);
			}
				
		}
	}
