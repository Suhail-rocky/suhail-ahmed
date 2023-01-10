import java.util.*;
public class T7
{
	public static void main(String[] args)
	{
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}