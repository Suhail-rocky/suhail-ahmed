import java.util.Scanner;
import java.util.ArrayList;
class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of Strings : ");
        int n=sc.nextInt();
        String arr[]= new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
			System.out.println(helper(arr));
    }
    public static ArrayList<String> helper(String arr[])
    {
        ArrayList<String> str = new ArrayList<String>();
		ArrayList<String> st = new ArrayList<String>();
        int x=0;
        for(int i=0;i<arr.length;i++) 
		{
            for (int j = i + 1; j < arr.length; j++) 
			{
				if(check(arr[i],arr[j]))
				{
					if(!str.contains(st))
					{
						st.add(arr[i]);
						st.add(arr[j]);
						str.addAll(st);
						System.out.println(st+"		"+str);
					}
					
					
				}
			}
		}
		return str;
	}
	public static boolean check(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		boolean flag=false;
		int count=0;
		if(c1.length == c2.length)
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(c1[i] == c2[j])
					{
						count++;
					}
				}
			}
			
		}			
		if(c1.length == count)
		{
			flag=true;
			return flag;
		}
		return flag;
	}
}