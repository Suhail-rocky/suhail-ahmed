import java.util.Scanner;
class P5
{
	//Eval-1 QP HR Batch-2 21-07-2022
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		char c[]=s.toCharArray();
		String arr[]=new String[c.length];
		int x=0;
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					arr[x]=count+""+c[i];
				}
			}
		}
	}
}