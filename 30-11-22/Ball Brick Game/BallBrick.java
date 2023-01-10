import java.util.*;
public class BallBrick
{
	static Scanner sc = new Scanner(System.in);
	static char c;
	static int ballcount;
	public static void main(String[] args)
	{
		System.out.println("Enter a size of the  NxN matrix : ");
		int n = sc.nextInt();
		String ball[][] = new String[n][n];
		game1(ball,n);
		game2(ball,n);
		print(ball,n);
		gamedirection(ball,n);
		
	}
	static void game1(String ball[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ball[i][j]=" ";
			}
		}x
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<n;j++){
				ball[i][j]="W";
				ball[j][i]="W";
				ball[j][6]="W";
			}
		}
		ball[6][1] ="G";
		ball[6][2] ="G";
		ball[6][3] ="o";
		ball[6][4] ="G";
		ball[6][5] ="G";
		
	}
	static void game2(String ball[][],int n)
	{
		do{
		
			System.out.println("Enter the brick's position and the brick type : ");
			int a = sc.nextInt();
			int b= sc.nextInt();
			String str = sc.next();
			ball[a][b] = str;
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
	static void gamedirection(String ball[][],int n)
	{
		do{
		System.out.println("Enter the Direction in which the ball need to traverse : ");
		String direction = sc.next();
		if(direction.equals("ST"))
		{
			ball[3][3]=" ";
		}
		else if(direction.equals("LD"))
		{
			ball[3][2]=" ";
			ballcount--;
		}
		else if(direction.equals("RD"))
		{
			ball[3][4]=" ";
			ballcount--;
		}
		print(ball,n);
		System.out.println("Do you want to continue Y or N ? ");
			c = sc.next().charAt(0);
		}while( c == 'Y');
	}
	
			
			
	}
