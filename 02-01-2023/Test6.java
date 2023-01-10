import java.util.*;
class Test6
{
static int distance(String s,String w1,String w2)
{
	
	if (w1 .equals( w2) )
		return 0 ;
	String temp = "";
	String words[] = s.split(" ");

	int min_dist = (words.length) + 1;

	for (int index = 0;index < words.length ; index ++)
	{

		if (words[index] .equals( w1))
		{
			for (int search = 0;search < words.length; search ++)
			{
				if (words[search] .equals(w2))
				{
	
					int curr =((index - search)*-1) - 1;

					if (curr < min_dist)
					{
						min_dist = curr ;
					}
				}
			}
		}
		
	}
	
	return min_dist;
}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		System.out.println("Enter a word 1:");
		String w1= sc.next();
		System.out.println("Enter a word 2:");
		String w2= sc.next();
		int ans = distance(s, w1, w2);
		if(ans == 0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(ans);
		}
	}

}

