import java.util.ArrayList;
import java.util.Scanner;

public class Level3Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Library> Book = new ArrayList<>();
        System.out.println("How many books you want to add : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
			
            System.out.println("\nEnter a BookName : ");
            String Bookname = sc.nextLine();
            Bookname = sc.nextLine();
            
            System.out.println("\nEnter a BookContent : ");
            String BookContent = sc.nextLine();
			
           // BookContent = sc.nextLine();
			System.out.println("\nEnter a BookPrice : ");
            int bookprice = sc.nextInt();
            Library book = new Library(i+1,Bookname,bookprice,BookContent);
			Book.add(book);
			
        }
		System.out.println("How many Books you want to view :");
		
		int view =sc.nextInt();
		System.out.println("\tBookID\tBookName\tBookPrice\tBookContent");
		for(int i=0;i<view;i++)
		{
			System.out.println(Book.get(i));
		}
		System.out.println("Enter a BookID that you want to remove :");
		int bid = sc.nextInt();
		for(Library o:Book){
			if(bid==o.BookID){
				Book.remove(o);
				System.out.println("Removed sucessfully");
				break;
			}
		}
        for(int i=0;i<Book.size();i++)
		{
			System.out.println(Book.get(i));
		}
		System.out.println("Enter a BookID that you want to update  :");
		bid = sc.nextInt();
		for(Library o:Book){
			if(bid==o.BookID){
				//Book.remove(o);
				System.out.println("Enter a Book Name :");
				String bookName = sc.next();
				o.BookName=bookName;
				System.out.println("Enter a Book prices :");
				int  bookPrices= sc.nextInt();
				o.BookPrice=bookPrices;
				System.out.println("Enter a Book Content :");
				String bookContent = sc.next();
				o.BookContent=bookContent;
				System.out.println("updated sucessfully");
				break;
			}
		}
		for(int i=0;i<Book.size();i++)
		{
			System.out.println(Book.get(i));
		}
    }
}
class Library
{
    Library(int bookID,String BookName,int bookPrice,String BookContent)
    {
        this.BookID=bookID;
        this.BookName=BookName;
        this.BookPrice=bookPrice;
        this.BookContent=BookContent;
    }
    
    String BookName;
    int BookID;
    int BookPrice;
    String BookContent;
	public String toString()
	{
		return "\t"+BookID+"\t"+BookName+"\t"+BookPrice+"\t"+BookContent;
	}
}
