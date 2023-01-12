import java.util.*;

class stringCompare
{
	public static void main(String args[])
	{
    		int i,flag=1,len1,len2;
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
	 	s1=sc.nextLine();
		char c[]=s1.toCharArray();
		s2="";
		for(int j=s1.length()-1;j>=0;j--)
		{
			s2+=c[j];
		}

		len1=s1.length();
		len2=s2.length();

		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();

    	    	if(len1==len2)
    		{	
    			for(i=0;i<len1;i++)
    			{
        			if(str1[i]!=str2[i])
        			{
            				flag=0;
	                		break;
				}
        		}
		}
 	 	else
    		{
    			flag=0; 
   		}	
	    	if(flag==1)
    		{
 	        	System.out.println("The two string are EQUAL!!!");
        		System.out.println(s1+" = "+s2);
				System.out.println("It is a palindrome ");
    		}

    		else
    		{
 	        	System.out.println("The two string are NOT EQUAL!!!");
        		System.out.println(s1+" != "+s2);
    		}
	}
}