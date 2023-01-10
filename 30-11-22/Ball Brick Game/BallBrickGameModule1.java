import java.util.*;
public class BallBrickGameModule1
{

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the NxN Matrix : ");
		int n = s.nextInt();
		String ball[][] = new String[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ball[i][j]=" ";
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					ball[i][j]="W";
				}
				if(j==0||j==n-1)
				{
					ball[i][j]="W";
				}
				if(i==n-1&&(j>0&&j<n-1))
				{
					ball[i][j]="G";
				if(i==n-1&&(j==n/2))
				{
					ball[i][j]="O";
				}
			}
		}
	}
	
		while(true)
		{
		
			System.out.println("Enter the brick position and the brick type : ");
			int i=s.nextInt();
			int j=s.nextInt();
			String h=s.next();
			ball[i][j]=h;
			System.out.println("Do you want to continue(Y or N)?");
			String g=s.next();
			if(g.charAt(0)!='Y')
			{
				break;
			}
		}
		System.out.println("Enter ball count : ");
		int balls = s.nextInt();
		BallBrickGameModule1 b = new BallBrickGameModule1();
		b.print(ball,n,balls);
		


	}
	public void print(String ball[][],int n,int balls)
	{
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ball[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter ball count :"+balls);
	}
}
