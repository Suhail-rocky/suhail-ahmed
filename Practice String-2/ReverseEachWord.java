import java.util.*;
public class ReverseEachWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String :");
		String s = sc.nextLine();
		s += " ";
		String rev="",word="";
		String reverse = revWord(s,rev,word,0);
		System.out.println(reverse);
	}
	static String revWord(String s,String rev,String word,int index)
	{
	if(index == s.length())
	{
		return rev;
	}
	char c = s.charAt(index);
	if(c!=32)
	{
		return revWord(s,rev,word+c,index+1);
	}
	else
	{
		return revWord(s,word+" "+rev,"",index+1);
	}
	}
}