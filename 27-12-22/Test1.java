import java.util.*;
public class Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c[i]>=65 &&  c[i]<= 91 || c[i] >= 97 && c[i] <= 122)
			{
				System.out.println("True");
				break;
			}				
			else
			{
				System.out.println("False");
				break;
			}
		}
	}
}