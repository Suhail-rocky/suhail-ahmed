import java.util.StringTokenizer;
class RegexSplit1
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("my name is suhail");
		System.out.println("Count of Tokens : "+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			//delimiter - default - space
		}
		StringTokenizer st1 = new StringTokenizer("www.suhailstudy.com",".");
		System.out.println("Count of Tokens : "+st1.countTokens());
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
			//delimiter - you can set any 
		}
		StringTokenizer st2 =new StringTokenizer("17-1-2023","-",true);
		System.out.println("Count of Tokens : "+st2.countTokens());
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
			//delimiter - you can set any and print also
		}
	}
}