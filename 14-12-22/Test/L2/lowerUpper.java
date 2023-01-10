import java.util.*;

class lowerUpper
{
	public static void main(String args[])
	{
    		String st;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string which is to be converted to uppercase");
	 	st=sc.nextLine();
		char str[]=st.toCharArray();
		System.out.println(str.length);
		for(i=0;i<str.length;i++)
		{
        		if(str[i]>='a' && str[i]<='z')
        		{ 
        			str[i]=(char)((int)str[i]-32);
        		}
				/*if(str[i] >='A' && str[i]<='Z')
				{
					str[i]=(char)((int)str[i]+32);
				}*/
    		}
    		System.out.println("The string in UpperCase is");
		for(i=0;i<str.length;i++)
    			System.out.print(str[i]);
	}
}