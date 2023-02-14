import java.util.Scanner;
class UserDefinedIndexOfMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		System.out.println("Enter a letter to find : ");
		String find=sc.next();
		System.out.println(indexOf(s,find));
	}
	public static int indexOf(String s,String find)
	{
		char c[]=s.toCharArray();
		char f[]=find.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(f[0] ==c[i])
			{
				System.out.println("Found");
			//	System.out.println(i);
				int res=i;
				return res;
			}
		}
		return -1;
	}
}