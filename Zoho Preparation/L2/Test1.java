import java.util.Scanner;
class Test1
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String-1");
		String s1=sc.next();
		System.out.println("Enter a String-2");
		String s2 = sc.next();
		helper(s1,s2);
		boolean ans=helper(s1,s2);
		System.out.println(ans);
	}
	public static boolean helper(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int count=c1.length-1;
		String temp="";
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i] != ' ')
			{
				temp += c1[i];
			}
			
			if(temp.equals(s2))
			{
				return true;
			}
			count--;
		}
		return false;
	}
}