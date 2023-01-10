import java.util.*;
public class SuceedingInteger{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array : ");
		int d=0;
		String s="";
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			d=d*10+arr[i];
		}
		d+=1;
		s+=d;
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+",");
		}
		System.out.println();
		System.out.println(d);
	}
}