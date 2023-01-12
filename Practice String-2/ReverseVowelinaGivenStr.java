import java.util.*;
public class ReverseVowelinaGivenStr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=c.length-1;j>=0;j--)
			{
				if((c[i] == 'a' || c[i] == 'e' || c[i] ==  'i' || c[i] =='o' || c[i] =='u' ) && (c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u'))
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					break;
					
				}
			}
		}
		System.out.println(new String(c));
		
	}
}