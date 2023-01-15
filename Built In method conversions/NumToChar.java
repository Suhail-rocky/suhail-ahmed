import java.util.*;

public class NumToChar {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String num = "";
      char letter = ' ';
      
      for(char c : s.toCharArray())
      {
        if(!(c >= '0' && c <= '9'))
        {
          if(num!="")
          {
          int n = strToNum(num);
          for(int i =0; i<n;i++)
          {
            System.out.print(letter);
          }
          }
          letter = c;
          num = "";
        }
        else
        {
          num+=c;
        }
      }
      int n = strToNum(num);
      for(int i =0; i<n;i++)
      {
        System.out.print(letter);
      }
      
       
    }
	public static int strToNum(String s) 
	{	   
		int num = 0; 
		int n = s.length(); 
		for(int i = 0; i < n; i++) 
		{
			num = num * 10 + ((int)s.charAt(i) - 48); 
		}
		return num; 
	}
}