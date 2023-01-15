import java.util.*;
public class Animal{
	Scanner sc = new Scanner(System.in);
	public void run(){
		System.out.println("Enter the meter  run : ");
		int n = sc.nextInt();
		int meters = n*1000;
		System.out.println("KM "+meters);
		}
		public static void main(String[] args){
		Animal n = new Animal();
		n.run();
		}
		}