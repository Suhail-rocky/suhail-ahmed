import java.util.*;
//Cross Pattern
class Pattern12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int n = sc.nextInt();
		crossPattern(n);
	}
	static void crossPattern(int n)
	{
		int count=-1,count1 = n;
		for(int i=0;i<n;i++)
		{
			count++;
			count1--;
			for(int j=0;j<n;j++)
			{
				if(i ==  count && j== count || i == count && j == count1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}