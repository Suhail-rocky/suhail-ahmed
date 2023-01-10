import java.util.*;
public class Test7
{
	public static void main(String[] args)
	{
		String temps="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		while(n>0)
		{
			int temp = n%10;
			temps=temps+""+temp;
			n /=10;
		}
		System.out.println(temps);
		char rev[]=temps.toCharArray();
		String t = "";
		for(int i=temps.length()-1;i>=0;i--)
		{
				t+=rev[i];
		}
		System.out.println(t);
		char r[] =t.toCharArray();
		for(int i=0;i<r.length;i++)
		{
			System.out.print(r[i]+" ");
		}
		for(int i=0;i<r.length-1;i++)
		{
			System.out.print(r[i]+" ");
		}
		
			
	}
			
			
		
	}
