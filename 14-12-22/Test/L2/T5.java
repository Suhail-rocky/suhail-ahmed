import java.util.*;
public class T5
{
	public static void main(String[] args)
	{
		int alphabet=0,number=0,special=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c[i] >= 'a' && c[i] <='z' || c[i] >= 'A' && c[i] <='Z')
			{
				alphabet++;
			}
			else if(c[i] >= '0' && c[i] <= '9')
			{
				number++;
			}
			else{
				special++;
			}
		}
		System.out.println("The alphabet count is"+alphabet);
		System.out.println("The Number count is "+number);
		System.out.println("The Special Character count is "+special);
		
			
			
		
	}
}