import java.util.*;
public class Test3_1
{
	public static void main(String[] args)
	{
		String temp ="";
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=25;j>=1;j--)
			{

			int m = c[i] + j;
			System.out.println(m);
			temp +=(char) m;
			}
			
		}
		System.out.println(temp);
		
		
	}
}
