import java.util.*;
public class BallBrick2
{
	static Scanner sc = new Scanner(System.in);
	static char c;
	static int ballcount;
	static String s;
	static int size;
	public static void main(String[] args)
	{
		System.out.println("Enter a size of the  NxN matrix : ");
		int n = sc.nextInt();
		String ball[][] = new String[n][n];
		game1(ball,n);
		game2(ball,n);
		print(ball,n);
		if(n%2 == 0)
		{
			size =n/2;
		}
		else
		{
			size = (n+1)/2;
		}
		
	}
	static void game1(String ball[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ball[i][j]=" ";
			}
		}
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<n;j++){
				ball[i][j]="W";
				ball[j][i]="W";
				ball[j][6]="W";
			}
		}
		for(int i=1;i<n;i++)
		{
		ball[n-1][i] ="G";
		ball[n-1][size] ="o";
		}
		
		
		
		
	}
	static void game2(String ball[][],int n)
	{
		do{
		
			System.out.println("Enter the brick's position and the brick type : ");
			int a = sc.nextInt();
			int b= sc.nextInt();
			s = sc.next();
			ball[a][b] = ""+s;
			System.out.println("Do you want to continue Y or N ? ");
			c = sc.next().charAt(0);
		}while( c == 'Y');
		System.out.println("Enter a ball Count : ");
		ballcount = sc.nextInt();
	}
	static void print(String ball[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ball[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Ball count is "+ballcount);
	}
}
