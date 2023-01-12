import java.util.*;
public class CountNumberOfWords
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		s +=" ";
		System.out.println(noOfWords(s,0,0));
	}
	static int noOfWords(String s,int i,int count)
	{
		if(i == s.length())
			return count;
		char c=s.charAt(i);
		if(c != 32)
			return noOfWords(s,i+1,count);
				return noOfWords(s,i+1,count+1);
		
	}
}