import java.util.*;
public class arrey{
	public static void main(String[] args){
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of elements you want to store : ");
	n=sc.nextInt();
	int[] x = new int[n];
	System.out.println("Enter the elements of the array : ");
	for(int i=0;i<n;i++)
	{
	x[i]=sc.nextInt();
	}
	for(int i=0;i<x.length/2;i++)
	{
	int temp = x[i];
	x[i]=x[x.length-i-1];
	x[x.length-i-1]=temp;
	}
	for(int i=0;i<n;i++){
	System.out.print(x[i]);
	}
	String temp="";
	for(int i=0;i<x.length;i++){
	temp+=x[i];
	}
	System.out.println("The String is "+temp);
	
}
}
