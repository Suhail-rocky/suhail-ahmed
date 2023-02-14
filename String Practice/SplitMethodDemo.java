import java.util.Scanner;
class SplitMethodDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "I love Java Technology";
		String[] s;
		s = str.split(" ");
		int length = str.length();
		System.out.println(s.length);
		for(int i = 0;  i < s.length; i++) {
		System.out.println(s[i]);
    }
 } 
		
		
	}

/*System.out.println("Enter a String : ");
		String str=sc.nextLine();
		String s[];
		s=str.split(" ");
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			System.out.println(s[i]+"");
		}*/