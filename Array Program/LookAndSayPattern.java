import java.util.*;
class LookAndSayPattern
{
    static String lookandsay(int n) 
	{
        if(n==1)
			return "1";
        String s=lookandsay(n-1);
        int count =1;
        int i=1;
        int num=s.charAt(0)-'0';
        StringBuilder t=new StringBuilder();
        while(i<s.length())
        {
            if(s.charAt(i)-'0'==num)
            {
                count++;
            }
            else
			{
                t.append(count).append(num);
                num=s.charAt(i)-'0';
                count=1;
            }
            i++;
        }
        t.append(count).append(num);
        return t.toString();
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n=sc.nextInt();
		System.out.println(lookandsay(n));
	}
}