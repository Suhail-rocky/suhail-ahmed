import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
class ArrayListDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  no of List:");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)//add
		{
			System.out.println("Enter a list :");
			String color = sc.next();
			list.add(color);
		}
		Iterator itr=list.iterator();
		while(itr.hasNext())//view
		{
			System.out.print(itr.next()+" ");
		}
		list.add(1,"Suhail");//update
		Iterator itrs=list.iterator();
		while(itrs.hasNext())
		{
			System.out.print(itrs.next()+" ");
		}
		System.out.println("Enter a retrieve Elemnet :");
		int retrieve=sc.nextInt();
		System.out.println(list.get(retrieve));//display
		System.out.println("Enter a update index element and value :");
		int update = sc.nextInt();
		String updates=sc.next();
		System.out.println(list.set(update,updates));//update
		
	}
}