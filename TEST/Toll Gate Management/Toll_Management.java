import java.util.*;


public class Toll_Management{
	public static void main(String[] args) {
		Toll_gate tg = new Toll();
		tg.Gate();
	}

}
abstract class Toll_gate{
	public abstract void Add();
	public abstract void view();
	public abstract void Display();
	public abstract void CircularPath();
	public final void Gate()
	{
		Toll_gate tg = new Toll();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you want to 1.Register 2.Toll amount Details 3.Toll journey Details 4.route and amount Details 5.Exit");
		int UserChoice = sc.nextInt();
		switch(UserChoice){
		case 1:
			tg.Add();
			break;
		case 2:
			tg.view();
			break;
		case 3:
			tg.Display();
			break;
		case 4:
			tg.CircularPath();
			break;
		case 5:
			System.exit(0);
			break;
		default :
				System.out.println("Try Again !");
				tg.Gate();
		}
		tg.Gate();
		
		
	}
}
class Toll extends Toll_gate{
	Scanner sc = new Scanner(System.in);
	static String Place[] = {"Chennai","Arakonam","Vellore","Kuppam","Bangalore"};
	static int Place1[]={1,2,3,4,5};
	static int fares[]={100,250,350,400,500};
	static int fare[] = new int[6];
	static int sno[] = {1,2,3,4,5};
	static Toll t[] = new Toll[10];
	static String Vehicle_no[] = new String[5];
	static String VehicleType[] = new String[5];
	char a1;
	static int LongestWay=0;
	static int ShortWay=0;
	static int Longestway[] = new int[5];
	static int Shortestway[] = new int[5];
	static int Tollno[]={1,2,3,4,5};
	static int Toll_no;
	public  void Add(){
		String Place[] = {"Chennai","Arakonam","Vellore","Kuppam","Bangalore"};
		int Place1[]={1,2,3,4,5};
		
			System.out.println("Enter a Type of Vehicle as 1.Bike 2.Car 3.Bus 4.Lorry 5.Others");
			int n = sc.nextInt();
		if(n == 1 || n == 2 || n == 3 || n == 4 || n == 5 )
		{
			System.out.println("Stating Place : "+Place1[0]+" - "+Place[0]);
			System.out.println("Ending Place : "+Place1[Place1.length-1]+" - "+Place[Place1.length-1]);
			if(n == 1){
				System.out.println("Enter a no of Tollgates Travel : ");
				Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				Vehicle_no[0]=sc.next();
				System.out.println("Enter a Vehicle Type :");
				VehicleType[0]=sc.next();
				for(int i=0;i<Toll_no;i++){
					LongestWay++;
					fare[0] +=fares[0];
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				Longestway[0]=LongestWay;
				Shortestway[0]=ShortWay;
				System.out.println("Longest Way : "+LongestWay);
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare[0]);
				System.out.println("Enter a Vehicle No : "+Vehicle_no[0]);
				System.out.println("Your Vehicle is Bike");
			}
			if(n == 2){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				Vehicle_no[1] = sc.next();
				System.out.println("Enter a Vehicle Type :");
				VehicleType[1]=sc.next();
				for(int i=0;i<Toll_no;i++){
					fare[1] +=fares[1];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				Longestway[1]=LongestWay;
				Shortestway[1]=ShortWay;
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare[1]);
				System.out.println("Enter a Vehicle No : "+Vehicle_no[1]);
				System.out.println("Your Vehicle is Car");
			}
			if(n == 3){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				Vehicle_no[2] = sc.next();
				System.out.println("Enter a Vehicle Type :");
				VehicleType[2]=sc.next();
				for(int i=0;i<Toll_no;i++){
					fare[2] +=fares[2];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				Longestway[2]=LongestWay;
				Shortestway[2]=ShortWay;
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare[2]);
				System.out.println("Enter a Vehicle No : "+Vehicle_no[2]);
				System.out.println("Your Vehicle is Bus");
			}
			if(n == 4){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				Vehicle_no[3] = sc.next();
				System.out.println("Enter a Vehicle Name :");
				VehicleType[3]=sc.next();
				for(int i=0;i<Toll_no;i++){
					fare[3] +=fares[3];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				Longestway[3]=LongestWay;
				Shortestway[3]=ShortWay;
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare[3]);
				System.out.println("Enter a Vehicle No : "+Vehicle_no[3]);
				System.out.println("Your Vehicle is Lorry");
			}
			if(n == 5){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				Vehicle_no[4] = sc.next();
				System.out.println("Enter a Vehicle Name :");
				VehicleType[4]=sc.next();
				for(int i=0;i<Toll_no;i++){
					fare[4] +=fares[4];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				Longestway[4]=LongestWay;
				Shortestway[4]=ShortWay;
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare[4]);
				System.out.println("Enter a Vehicle No : "+Vehicle_no[4]);
				System.out.println("Your Vehicle is Others");
			}
			System.out.println("Do you want to continue Yes or No");
			String yes=sc.next();
			if(yes.equals("Yes"))
			{
				Toll t= new Toll();
				t.Add();
			}
			
		}
	
		
	}

	public void view(){
		
		System.out.println("S.no \tVehicle No \tVehicle Type \tAmount\tLongest Way\tShortest Way");
		for(int i=0;i<5;i++)
			if(VehicleType[i] != null)
		System.out.println(sno[i]+"\t"+Vehicle_no[i]+"\t\t"+VehicleType[i]+"\t\t"+fare[i]+"\t"+Longestway[i]+"\t\t"+Shortestway[i]);
		System.out.println("\n");
		
	}
	public void Display(){
		System.out.println("S.no \tVehicle No \tVehicle Type \tAmount \tStart Journey \tEnd Journey ");
		for(int i=0;i<5;i++)
			if(VehicleType[i] != null)
		System.out.println(sno[i]+"\t"+Vehicle_no[i]+"\t\t"+VehicleType[i]+"\t\t"+fare[i]+"\t\t"+Tollno[0]+"\t\t"+Toll_no);
		
		
	}
	public void CircularPath(){
		System.out.println("S.no \tVehicle No \tVehicle Type \tAmount \tStart Journey \tEnd Journey ");
		for(int i=0;i<5;i++)
			if(VehicleType[i] != null)
		System.out.println(sno[i]+"\t"+Vehicle_no[i]+"\t\t"+VehicleType[i]+"\t\t"+fare[i]+"\t\t"+Place[i]+"\t\t"+Place[Toll_no]);
		
	}
	
}

