import java.util.*;
public class TestDemo
{
	public static void main(String[] args)
	{
		int min=10000,max=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String 1:");		
		String s1=sc.next();
		System.out.println("Enter a String 2:");		
		String s2=sc.next();
		char c[]=s1.toCharArray();
		char d[]=s2.toCharArray();
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				
				if(d[i]==c[j])
				{
					//index=i;
					if(max<j)
					{
						max=j;
					}
					if(min>j)
					{
						min=j;
					}
					break;
				}
			}
		}
		for(int i=min;i<=max;i++)
		{
			System.out.print(c[i]+"");
		}
	}
}