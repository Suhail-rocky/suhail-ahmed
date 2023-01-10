import java.util.*;
public class T2
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		int arr[]=new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			count = 1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					count++;
				}
				arr[i]=count;
			}
		}
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+""+arr[i]);
	}
}
