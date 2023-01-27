import java.util.Scanner;
class Lift
{
	static Scanner sc = new Scanner(System.in);
	static int l=0;
	static int MAX_SIZE=5;
	String lift[]=new String[MAX_SIZE];
	int liftno[]=new int[MAX_SIZE];
	public static  void main(String[] args)
	{
		
		Lift l=new Lift();
		l.initialize();
		l.manage();	
	}
	public void initialize()
	{
		int x=1;
		for(int i=0;i<MAX_SIZE;i++)
		{
			lift[i]="L"+x;
			x++;
		}
	}
	public void manage()
	{
		int choice=0;
		do
		{
		System.out.println("Enter 1.assignLift 2.view 3.maintenence 4.Exit");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				assignLift();
				break;
			case 2:
				viewLift();
				break;
			case 3:
				maintenence();
				break;
			
		}
		}while(choice != 4);
	}
	public void assignLift()
	{
		
		System.out.println("Enter the floor :");
		int fromfloor = sc.nextInt();
		int tofloor = sc.nextInt();
		if(tofloor <=  10 && fromfloor <=  10)
		{
			findLift(fromfloor,tofloor);
		}
		else 
		{
			System.out.println("Only Ten floors are there :");
			System.out.println("Try Again");
			manage();
		}
		viewLift();
		
	}
	public void findLift(int from,int tofloor)
	{
		if(l == MAX_SIZE)
			{
				compareLift(from,tofloor);
			}		
			if( l!=MAX_SIZE)
			{
				if(liftno[l] == 0)
				{
					System.out.println("L"+(l+1)+" is assigned ");
				}
				
				if(l == 0 || l == 1)
					{
						if(tofloor >=0 && tofloor <= 5)
						{
							liftno[l]=tofloor;
							l++;
						}
						else
						{
							System.out.println("L"+l+" is only 0 - 5 th floor" );
						}
					}
					else if(l == 2 || l == 3)
					{
						if(tofloor >= 6 && tofloor <= 10)
						{
							liftno[l]=tofloor;
							l++;
						}
						else
						{
							System.out.println("L"+l+" is only 6 - 10 th floor" );
						}
					}
					else
					{
						liftno[l]=tofloor;
						l++;
					}
			}
	}
	public void compareLift(int from,int to)
	{
		int ans = 0,min=10000;
		for(int i=0;i<MAX_SIZE;i++)
		{
			ans = to - liftno[i];
			if(ans < 0)
			{
				ans *= -1;
			}
			if(min > ans)
			{
				min=ans;
			}
			System.out.println("l"+(i+1)+"is assigned "+min);
			break;
		}
			
	}
	public void viewLift()
	{
		System.out.print("Lift :	");
		for(int i=0;i<MAX_SIZE;i++)
		{
			System.out.print(lift[i]+" ");
		}
		System.out.println();
		System.out.print("Floor :	");
		for(int i=0;i<MAX_SIZE;i++)
		{
			System.out.print(liftno[i]+" ");
		}
		System.out.println();
	}
	public void maintenence()
	{
		System.out.println("Which lift is in a Maintanenece:");
		int maintenence=sc.nextInt();
		liftno[maintenence+1]=-1;
	}
}