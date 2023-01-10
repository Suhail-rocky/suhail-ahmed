import java.util.*;
public class Test3
{
	public static void main(String[] args)
	{
		int index=0,min = 1000,max=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String 1:");
		String str = sc.next();
		System.out.println("Enter a String 2:");
		String str1 = sc.next();
		char c[] = str.toCharArray();
		char ch[] = str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				
				if(ch[i]==c[j])
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