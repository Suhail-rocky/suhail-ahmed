import java.util.*;
public class SuceedingInteger
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter a array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=0;
		for(int i=0;i<size;i++)//array to number
		{
			n =n * 10+arr[i];
		}
		//System.out.println(n);
		n+=1;
		//System.out.println(n);
		String temp="";
		temp+=n;//number to String(parseInt work)
		System.out.println(temp);
		char c[]=temp.toCharArray();
		for(char data : c)
			System.out.print(data+" ");
	}
	
}