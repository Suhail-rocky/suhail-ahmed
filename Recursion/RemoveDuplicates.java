import java.util.*;
class RemoveDuplicates
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		removeDuplicates(s,0,"");
	}
	public static void removeDuplicates(String s,int i,String temp)
	{
		if(i == s.length()-1)
		{
			System.out.println(temp);
			return;
		}
		char c[]=s.toCharArray();
		if(c[i] == c[i+1])
		{
			removeDuplicates(s,i+1,temp);
		}
		removeDuplicates(s,i+1,temp+c[i]);
		
	}
}