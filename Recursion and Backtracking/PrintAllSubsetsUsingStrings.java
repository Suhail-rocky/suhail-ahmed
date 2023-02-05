import java.util.ArrayList;
import java.util.Scanner;
class PrintAllSubsetsUsingStrings
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		findSubset(n,"");
	}
	public static void findSubset(int n,String temp)
	{
		if(n == 0)
		{
			printSubset(temp);
			return;
		}
		//add hoga
		findSubset(n-1,temp+""+n);
		//add nahi hoga
		findSubset(n-1,temp+"_");
		
	}
	public static void printSubset(String temp)
	{
		char c[]=temp.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
}