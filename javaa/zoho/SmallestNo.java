import java.util.*;
public class SmallestNo{
	public static void FindSmallestNo(int x,int y,int z) {
	if(x<y)
	System.out.println("The smallest value is : "+x);
	else if(y<z)
	System.out.println("The Smallest value is : "+y);
	else if(z<x)
	System.out.println("The Smallest value is : "+z);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		FindSmallestNo(a,b,c);
		}
		}