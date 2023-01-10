import java.util.*;
public class Test7{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		printString(n);
	}
	public static void printString(int n)
	{
		String temp="";
		while(n>0)
		{
			int rem = n%26;
			if(rem == 0)
			{
				String cn = temp +"Z";
				n = (n/26)-1;
			}
			else
			{
				System.out.println((char)((rem - 1) +'A'));
				cn = temp +((char)((rem - 1) +'A'));
				n = n/26;
			}
		char c[] = cn.toCharArray();
		for(int i=cn.length()-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
	}
}