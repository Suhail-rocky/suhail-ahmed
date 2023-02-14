import java.util.Scanner;
class UserDefinedContainsMethods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s= sc.nextLine();
        System.out.println("Enter a String to Check : ");
        String check = sc.next();
        System.out.println(contains(s,check));

    }
    public static boolean contains(String s,String check)
    {
        char c[]=s.toCharArray();
        char f[]=check.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++)
        {
			for(int j=0;j<f.length;j++)
			{
				if(c[i] == f[j])
				{
					count++;
				}
			}

        }
        if(count == f.length)
        {
            return true;
        }
		//System.out.println(count);
        return false;
    }
}
