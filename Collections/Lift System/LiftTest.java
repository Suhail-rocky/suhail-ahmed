import java.util.Scanner;
import java.util.ArrayList;
public class LiftTest{
	public static void main(String[] args){
	    menu();
	}
	public static void menu(){
		Scanner s=new Scanner(System.in);
		Module2 m2=new Module2();
		Module3 m3=new Module3();
		Module5 m5=new Module5();
		while(true){
		System.out.println("---------------Lift--------------");
		System.out.println("1.Module");
		System.out.println("2.Module");
		System.out.println("3.Module");
		System.out.println("4.Module");
		System.out.println("5.Module");
		System.out.println("6.Module");
		System.out.println("7.Module");
		System.out.println("8.Module");
		System.out.println("9.Exit");
		int no=s.nextInt();
		switch(no){
			case 1:{
				AbstractLift.display();
				break;
			}
			case 2:{
				m2.getInput();
				break;
			}
			case 3:{
				m3.getInput();
				break;
			}
			case 4:{
				m2.getInput();
				break;
			}
			case 5:{
				m5.getInput();
				break;
			}
			case 6:{
				m2.getInput();
				break;
			}
			case 7:{
				
				break;
			}
			case 8:{
				m2.setMaintain();
				break;
			}
			default:
			    return;
		}
		}
	}
}
abstract class AbstractLift{
	static ArrayList<Integer> floor=new ArrayList<>();
	Scanner s=new Scanner(System.in);
	static{
		floor.add(0);
		floor.add(0);
		floor.add(0);
		floor.add(0);
		floor.add(0);
	}		
	public final static void assign(int cfno,int dfno){
		int temp=Integer.MAX_VALUE;
		int ind=-1;
		if(dfno>cfno){
		for(int i=0;i<floor.size();i++){
			if(cfno==floor.get(i)){
				ind=i;
				break;
			}
			if(dfno>=floor.get(i)){
				int value=Math.abs(floor.get(i)-cfno);
				if(cfno>=floor.get(i)&&value<temp){
					temp=value;
					ind=i;
				}
			}
		}
		}
		else if(dfno<cfno){
			for(int i=0;i<floor.size();i++){
				if(floor.get(i)!=0){
					if(dfno<=floor.get(i)){
						int value=Math.abs(floor.get(i)-cfno);
						if(cfno<=floor.get(i)&&value<temp){
							temp=value;
							ind=i;
						}
					}
				}
			}
		}
		if(ind!=-1){
			floor.set(ind,dfno);
			System.out.println("L"+(ind+1)+"  is assigned....");
		}
		display();
	}
    public final static void display(){
		System.out.print("Lift:   ");
		for(int i=0;i<floor.size();i++)
			System.out.print("L"+(i+1)+" ");
		System.out.println();
		System.out.print("Floor:  ");
		for(int i:floor)
			System.out.print(i+"  ");
		System.out.println();
	}
    public abstract void getInput();
    public void extendLift(){
		System.out.println("Enter the Lift Count do you want to add?");
		int count=s.nextInt();
		for(int i=0;i<count;i++)
			floor.add(0);
		System.out.println("Lift added succesfully....");
		display();
	}
    public void setMaintain(){
		System.out.println("Enter the lift no : ");
		int no=s.nextInt();
		floor.set(no,-1);
		System.out.print(no+"Lift is  for mainteance....");
	}		
}
class Module2 extends AbstractLift{
	public void getInput(){
		display();
		System.out.println("Enter the Current floor: ");
		int cfno=s.nextInt();
		System.out.println("Enter the Destination floor: ");
		int dfno=s.nextInt();
		assign(cfno,dfno);
	}
}
class Module3 extends AbstractLift{
	public void getInput(){
		display();
		System.out.println("Enter the Current floor: ");
		int cfno=s.nextInt();
		System.out.println("Enter the Destination floor: ");
		int dfno=s.nextInt();
		assignNearest(cfno,dfno);
	}
	public void assignNearest(int cfno,int dfno){
		int temp=Integer.MAX_VALUE;
		int ind=-1;
		for(int i=0;i<floor.size();i++){
			int value=Math.abs(floor.get(i)-cfno);
			if(value<temp){
				temp=value;
				ind=i;
			}
		}
		if(ind!=-1){
			floor.set(ind,dfno);
			System.out.println("L"+(ind+1)+" is assigned....");
		}
		display();
	}
}
class Module5 extends AbstractLift{
	public void getInput(){
		System.out.println("Enter the Current floor: ");
		int cfno=s.nextInt();
		System.out.println("Enter the Destination floor: ");
		int dfno=s.nextInt();
		assignFloorwise(cfno,dfno);
	}
	public void assignFloorwise(int cfno,int dfno){
		int temp=Integer.MAX_VALUE;
		int ind=-1;
	if(cfno>=0&&cfno<=5&&dfno>=0&&dfno<=5&&floor.get(0)!=-1||floor.get(1)!=-1){
		if(dfno>cfno){
		for(int i=0;i<2;i++){
			if(dfno>=floor.get(i)){
				int value=Math.abs(floor.get(i)-cfno);
				if(cfno>=floor.get(i)&&value<temp){
					temp=value;
					ind=i;
				}
			}
		}
		}
		else if(dfno<cfno){
			for(int i=0;i<2;i++){
				if(floor.get(i)!=0){
					if(dfno<=floor.get(i)){
						int value=Math.abs(floor.get(i)-cfno);
						if(cfno<=floor.get(i)&&value<temp){
							temp=value;
							ind=i;
						}
					}
				}
			}
		}
		if(ind!=-1){
			floor.set(ind,dfno);
			System.out.println("L"+(ind+1)+"  is assigned....");
		}
		display();
		return;
	}
	else if(cfno>=6&&cfno<=10&&dfno>=6&&dfno<=10&&floor.get(2)!=-1||floor.get(3)!=-1){
		if(dfno>cfno){
		for(int i=2;i<4;i++){
			if(dfno>=floor.get(i)){
				int value=Math.abs(floor.get(i)-cfno);
				if(cfno>=floor.get(i)&&value<temp){
					temp=value;
					ind=i;
				}
			}
		}
		}
		else if(dfno<cfno){
			for(int i=2;i<4;i++){
				if(floor.get(i)!=0){
					if(dfno<=floor.get(i)){
						int value=Math.abs(floor.get(i)-cfno);
						if(cfno<=floor.get(i)&&value<temp){
							temp=value;
							ind=i;
						}
					}
				}
			}
		}
		if(ind!=-1){
			floor.set(ind,dfno);
			System.out.println("L"+(ind+1)+"  is assigned....");
		}
		display();
		return;
	}
	else if(cfno>=0&&cfno<=10&&dfno>=0&&dfno<=10){
		if(dfno>cfno&&floor.get(4)!=-1){
			if(cfno==floor.get(4)){
				floor.set(4,dfno);
			    System.out.println("L"+(4+1)+"  is assigned....");
			    display();
		        return;
			}
			if(dfno>=floor.get(4)){
					floor.set(4,dfno);
			        System.out.println("L"+(4+1)+"  is assigned....");
			        display();
					return;
				}
			}
		else if(dfno<cfno&&floor.get(i)!=-1){
				if(floor.get(4)!=0){
					if(dfno<=floor.get(4)){
						floor.set(4,dfno);
			            System.out.println("L"+(4+1)+"  is assigned....");
			            display();
					    return;
					  }
				}
			}
		if(floor.get(4)==-1){
			System.out.println("Lift is under mainteance....");
		}
		display();
		return;
	}
	}
}