import java.util.*;
public class Test2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c.length < 8)
			{
				System.out.println("Weak");
				break;
			}
			else if(c[i]>=65 &&  c[i]<= 91 || c[i] >= 97 && c[i] <= 122)
			{
				System.out.println("Medium");
				break;
			}
			else if(c[i]>=65 &&  c[i]<= 91 || c[i] >= 97 && c[i] <= 122 || c[i] >= 48 && c[i] <= 57 )
			{
				System.out.println("Good");
				break;
			}
			else if(c[i]>=65 &&  c[i]<= 91 || c[i] >= 97 && c[i] <= 122 || c[i] >= 48 && c[i] <= 57 || c[i] >= 33 && c[i] <= 41 )
			{
				System.out.println("Strong ");
				break;
			}
			
		}
	}
}