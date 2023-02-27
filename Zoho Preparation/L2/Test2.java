import java.util.Scanner;
class Test2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		boolean ans=removeDuplicates(s);
		System.out.println(ans);
		
	}
	public static boolean removeDuplicates(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					return false;
				}
				if(c[i] >= 97 && c[i] <= 122)
				{
					c[j]=(char)(c[j]-32);
					//System.out.println(c[i]+""+c[j]);
					if(c[i] == c[j])
					{
						return false;
					}
				}
				if(c[i] >= 65 && c[i] <= 90)
				{
					c[j]=(char)(c[j]+32);
					//System.out.println(c[i]+""+c[j]);
					if(c[i] == c[j])
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}