import java.util.*;
public class Test4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[]=s.toCharArray();
		String temp="";
		String copy ="";
		for(int i=0;i<c.length;i++)
		{	
			for(int j=0;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					copy = temp;
					System.out.println(copy);
					temp="";
				}
				if(c[i] != c[j])
				{
					temp += c[i];
					temp += c[j];
				}
			}
		
		}
		System.out.println(temp);
}
}