import java.util.*;
public class Occurences
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[]=s.toCharArray();
		int arr[]=new int[c.length];
		int visited=-1;
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					count++;
					arr[j]=visited;
				}
			}
			if(arr[i] !=  visited)
			{
				arr[i]=count;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(arr[i] != -1)
			{
				System.out.print(c[i]+"-"+arr[i]+"");
				System.out.println();
			}
		} 
	}
}