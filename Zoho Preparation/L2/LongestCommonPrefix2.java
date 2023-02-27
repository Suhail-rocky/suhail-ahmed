import java.util.Scanner;
class LongestCommonPrefix2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of string : ");
		int n=sc.nextInt();
		String arr[] = new String[n];
		System.out.println("Enter a Strings : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		int l=arr.length;
		String first=arr[0];
		for(int i=1;i<=l-1;i++)
		{
			first=commonPrefix(first,arr[i]);
		}
		if(first.length()>0)
		{
			System.out.println(first);
		}
		else
		{
			System.out.println("There is no common prefix among the input strings");
		}
	}
	public static String commonPrefix(String str1,String str2)
	{
		String res="";
		int i,j;
		int n1=str1.length(),n2=str2.length();
		for(i=0,j=0;i<n1-1 && j < n2 -1;i++,j++)
		{
			if(str1.charAt(i) != str2.charAt(j))
			{
				break;
			}
			res += str1.charAt(i);
		}
		return res;
	}
}