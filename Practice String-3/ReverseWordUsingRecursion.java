import java.util.*;
public class ReverseWordUsingRecursion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		s+=" ";
		System.out.println(revEachWord(s,0,"",""));
		
	}
	static String revEachWord(String s,int i,String rev,String word)
	{
		if( i==s.length())
			return rev;
		char c=s.charAt(i);
		if(c != 32)
			return revEachWord(s,i+1,rev,word+c);
				return revEachWord(s,i+1,word+" "+rev,"");
	}
}