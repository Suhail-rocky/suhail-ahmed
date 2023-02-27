import java.util.*;
//Decimal to Binary
class ZohoFail3
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		String binary="";
		while(n != 0)
		{
			int m=n%2;
			binary +=m;
			n =n/2;
		}
		
		System.out.println(reverse(binary));
	}
	public static String reverse(String binary)
	{
		String temp="";
		char c[]=binary.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			temp += c[i];
		}
		return temp;
	}
}