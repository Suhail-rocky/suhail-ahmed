import java.util.*;
public class SortingAlphabetical
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp = c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println(new String(c));
	}
}