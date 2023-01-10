import java.util.Scanner;
class SubstringWithNoRepetence
{
	static int sum=1;
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.next();
		findSub(s,"",0);
		System.out.println(sum);
		
	}
	public static void findSub(String s,String empty,int ind)
	{
		if(ind==s.length()-1)
			return ;
		char c=s.charAt(ind);
		empty+=c;
		String empty2="";
		empty2+=c;
		System.out.println(empty2);
		boolean flag=findDup(empty);
		if(flag==true)
		{	
			findSub(s,empty,ind+1);
		}
		else
			findSub(s,empty2,ind+1);
	}
	public static boolean findDup(String s)
	{
		int tsum=0;
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag=false;
					break;
				}
			}
			if(flag==false)
				break;
			++tsum;
		}
		if(flag==false)
			return false;
		else
		{
			if(sum<tsum)
				sum=tsum;
			return true;
		}
		
	}
}