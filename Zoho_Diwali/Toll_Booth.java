import java.util.*;
public class Toll_Booth{
	public static void main(String[] args) {
		Toll_gate tg = new Toll();
		tg.Gate();
	}

}
abstract class Toll_gate{
	public  abstract void Add();
	public abstract void view();
	public abstract void Display();
	public abstract void CircularPath();
	public final void Gate()
	{
		Toll_gate tg = new Toll();
		tg.Add();
		tg.view();
		tg.Display();
		tg.CircularPath();
		
	}
}
class Toll extends Toll_gate{
	Scanner sc = new Scanner(System.in);
	String Place[] = {"Chennai","Arakonam","Vellore","Kuppam","Bangalore"};
	int Place1[]={1,2,3,4,5};
	int fares[]={100,250,350,400,500};
	Toll t[] = new Toll[10];
	String Vehiclename,VehicleType;
	char a1;
	int LongestWay=0;
	int ShortWay=0;
	int fare=0;
	public  void Add(){
		String Place[] = {"Chennai","Arakonam","Vellore","Kuppam","Bangalore"};
		int Place1[]={1,2,3,4,5};
		System.out.println("Enter a Type of Vehicle as 1.Bike 2.Car 3.Bus 4.Lorry 5.Others");
		int n = sc.nextInt();
		do{
		if(n == 1 || n == 2 || n == 3 || n == 4 || n == 5 )
		{
			System.out.println("Stating Place :"+Place1[0]+" - "+Place[0]);
			System.out.println("Ending Place :"+Place1[Place1.length-1]+" - "+Place[Place1.length-1]);
			if(n == 1){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				String Vehicle_no = sc.next();
				for(int i=0;i<Toll_no;i++){
					LongestWay++;
					fare +=fares[0];
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare);
				System.out.println("Enter a Vehicle No : "+Vehicle_no);
				System.out.println("Your Vehicle is Bike");
			}
			if(n == 2){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				String Vehicle_no = sc.next();
				for(int i=0;i<Toll_no;i++){
					fare +=fares[1];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare);
				System.out.println("Enter a Vehicle No : "+Vehicle_no);
				System.out.println("Your Vehicle is Car");
			}
			if(n == 3){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				String Vehicle_no = sc.next();
				for(int i=0;i<Toll_no;i++){
					fare +=fares[2];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare);
				System.out.println("Enter a Vehicle No : "+Vehicle_no);
				System.out.println("Your Vehicle is Bus");
			}
			if(n == 4){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				String Vehicle_no = sc.next();
				for(int i=0;i<Toll_no;i++){
					fare +=fares[3];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare);
				System.out.println("Enter a Vehicle No : "+Vehicle_no);
				System.out.println("Your Vehicle is Lorry");
			}
			if(n == 5){
				System.out.println("Enter a no of Tollgates Travel : ");
				int Toll_no = sc.nextInt();
				System.out.println("Enter a Vehicle No : ");
				String Vehicle_no = sc.next();
				for(int i=0;i<Toll_no;i++){
					fare +=fares[4];
					LongestWay++;
				}
				for(int i=Toll_no;i>=0;i--){
					ShortWay++;
				}
				System.out.println("Stating Place :"+Place[0]+" - "+Place1[0]);
				System.out.println("Ending Place :"+Place[Toll_no]+" - "+Place1[Toll_no]);
				System.out.println("Longest Way : "+LongestWay);
				System.out.println("Shortest Way : "+ShortWay);
				System.out.println("Fare is : "+fare);
				System.out.println("Enter a Vehicle No : "+Vehicle_no);
				System.out.println("Your Vehicle is Others");
			}
		}
		System.out.println("Do you wants to continue Y/N");
		a1=sc.next().charAt(0);
	}while(a1 == 'Y');

		
	}

	public void view(){
		
		
	}
	public void Display(){
		
	}
	public void CircularPath(){
		
	}
	public String toString(){
		return "Vehicle name "+"Vehicle Type ";
		
	}
}

