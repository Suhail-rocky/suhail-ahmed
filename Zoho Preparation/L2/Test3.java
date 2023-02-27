import java.util.Scanner;
import java.util.ArrayList;
class Test3
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
        helper(arr);
    }
    public static void helper(String arr[])
    {
        ArrayList<String> str = new ArrayList<String>();
        int x=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                str.addAll(check(arr[i], arr[j]));
            }
        }
        System.out.println(str);
    }
    public static ArrayList<String> check(String s1, String s2)
    {
        ArrayList<String>srr=new ArrayList<String>();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
		boolean ans=findAnagram(c1,c2);
		if(ans == true)
		{
			srr.add(s1);
			srr.add(s2);
			return srr;
		}
		else
		{
			srr.add(s2);
		}
		return srr;
	   
    }
	public static boolean findAnagram(char c1[],char c2[])
	{
		char c3[]=sort(c1);
		char c4[]=sort(c2);
	   String s1 = new String(c3);
	   String s2 = new String(c4);
	   System.out.println(s1+""+s2);
	   if(s1.equals(s2))
	   {
		   return true;
	   }
	   return false;
	}
	public static char[] sort(char[] c1)
	{
		for(int i=0;i<c1.length;i++)
	   {
		   for(int j=i+1;j<c1.length;j++)
		   {
			   if(c1[i]>c1[j])
			   {
				   char temp = c1[i];
				   c1[i]=c1[j];
				   c1[j]=temp;
			   }
		   }
	   }
	   return c1;
	}
}
