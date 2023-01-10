import java.util.*;
public class Test2
{  
	int max = 256;  
	public void getOccuringChar(String str)  
	{  
		int count[] = new int[max];  
		int len = str.length();    
		for (int i = 0; i < len; i++)
		{
			count[str.charAt(i)]++; 
		}			 
		char ch[] = new char[str.length()];  
		for (int i = 0; i < len; i++)   
		{  
			ch[i] = str.charAt(i);  
			int find = 0;  
			for (int j = 0; j <= i; j++)   
			{  
				if (str.charAt(i) == ch[j]) 
				{					
					find++; 
				}					
			}             	
			if (find == 1)  
			{   
				System.out.print(str.charAt(i)+""+count[str.charAt(i)]);  
			}  
		
		}
	}    
	public static void main(String args[])  
	{  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next(); 
		Test2 t = new Test2();
		t.getOccuringChar(str);  
	}  
}  