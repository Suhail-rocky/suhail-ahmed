import java.util.*;
public class NumberToLetter
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		String temp="";
		while(n>0)
		{
			char c =(char)((n-1)%26+'A');
			n=(n-1)/26;
			temp+=c;
		}
		for(int i=temp.length()-1;i>=0;i--)
		{
			System.out.print(temp.charAt(i)+"");
		}
	}
}