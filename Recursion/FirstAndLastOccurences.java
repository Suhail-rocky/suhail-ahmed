import java.util.Scanner;
class FirstAndLastOccurences
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.next();
		char c=sc.next().charAt(0);
		find(s,0,c,-1,-1);
	}
	public static void find(String s,int i,char eq,int first,int last)
	{
		if(i == s.length())
		{
			System.out.println(first);
			System.out.println(last);
			return;
		}
		if(s.charAt(i) == eq)
		{
			if(first == -1)
				first=i;
			else
				last=i;
		}
		find(s,i+1,eq,first,last);
	
	}
}