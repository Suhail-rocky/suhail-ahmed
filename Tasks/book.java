import java.util.*;
public class library{
public static void main(String[] args){
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of books you want to store : ");
	n = sc.nextInt();
	String[] bookname=new String[n];
	System.out.println("Enter the BookName : ");
	for(int i=0;i<n;i++)
	{
	bookname[i]=sc.nextLine();
	}
	System.out.print("Enter the number of books you want to store : ");
	n = sc.nextInt();
	int[] bookprice=new int[n];
	System.out.println("Enter the Book price : ");
	for(int i=0;i<n;i++)
	{
	bookprice[i]=sc.nextInt();
	}
	System.out.print("Enter the number of booksID you want to store : ");
	n = sc.nextInt();
	int[] bookid=new int[n];
	System.out.println("Enter the Book ID : ");
	for(int i=0;i<n;i++)
	{
	bookid[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	System.out.println(bookname[i]);
	System.out.println(bookprice[i]);
	System.out.println(bookid[i]);
	}
}
}
	
	
	
