import java.util.*;
public class CRM
{
    public static void main(String[] args)
    {
        String reverse="",temp="",temp1="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of array :");
        int n = sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter a array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("Enter Odd Or Even :");
        String check=sc.next();
        for(int i=0;i<n;i++)
        {
            if(check.equals("Even"))
            {
                if(i%2 == 0)
                {
                    reverse=arr[i];
                    char c[]=reverse.toCharArray();
                    for(int j=reverse.length()-1;j>=0;j--)
                    {
                        
						temp+=c[j];
						
                    }
					arr[i]=temp;
					
                }
				temp="";
            }
            else if(check.equals("Odd"))
            {
                if(i%2 != 0)
                {
                    reverse=arr[i];
                    char d[]=reverse.toCharArray();
                    for(int j=reverse.length()-1;j>=0;j--)
                    {
        
						temp1+=d[j];
                    }
					arr[i]=temp1;
					
                }
				temp1="";
            }
			
        }
		for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}

    }
}