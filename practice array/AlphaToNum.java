import java.util.*;
public class AlphaToNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();
		AlphaToNum(str,0,0);
		
	}
	static void AlphaToNum(String str,int res,int index)
	{
		if(index == str.length())
		{
			System.out.println(res);
			return;
		}
		res*=26;
		AlphaToNum(str,res+str.charAt(index)-'A'+1,index+1);
		
	}
	
}