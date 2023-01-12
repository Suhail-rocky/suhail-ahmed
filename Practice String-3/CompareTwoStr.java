import java.util.*;
public class CompareTwoStr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String-1");
		String s1 = sc.next();
		System.out.println("Enter a String-2");
		String s2 = sc.next();
		System.out.println(compare(s1,s2));
	}
	static boolean compare(String s1,String s2)
	{
		int count=0;
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i] == c2[j])
				{
					count++;
				}
			}
		}
		int ans = (c1.length+c2.length)/2;
		if(ans == count)
			 return true;
				return false;
	}
}