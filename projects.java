package day2;

import java.util.Scanner;

public class projects {
	public static void main(String[] args) {
		char r;
		Scanner sc = new Scanner(System.in);
		projects p = new projects();
		p.book();
		System.out.println("If want to exit : YES - Y or y or NO - N or n");
		r=sc.next().charAt(0);
			if(r == 'Y' || r =='y'){
				Library z = new Library();
				z.exit();
			}
			else if(r =='n'|| r =='N'){
				p.book();
				
			}
	}
		public static void book(){
		System.out.println("***********LIBRARY MANAGEMENT SYSTEM **********");
		System.out.println("Press 1 to add");
		System.out.println("Press 2 to issues  a book");
		System.out.println("Press 3 to return a book ");
		System.out.println("press 4 to complete issue Details");
		System.out.println("Press 5 to Exit ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number as per the options  : ");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			Library aa = new Library();
			aa.add();
			break;
		case 2:
			Library bb = new Library();
			bb.issues();
			break;
		case 3:
			Library cc = new Library();
			cc.ret();
			break;
		case 4:
			Library dd= new Library();
			dd.details();
			break;
		case 5:
			Library ee = new Library();
			ee.exit();
			break;
			default :
				System.out.println("Invalid Number !");
				}
		}
		
			
		
		}
	
	class Library{
		static String str;
		static int b;
		static int date;
		static int a;
		static int c;
		void add(){
			System.out.println("Enter book Name : ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			System.out.println("Enter book Price : ");
			float price = sc.nextFloat();
			System.out.println("Enter book No : ");
			int bookno = sc.nextInt();
			System.out.println("Your  Details are : ");
			System.out.println(str);
			System.out.println(price);
			System.out.println(bookno);
		}
		public void exit() {
			System.exit(0);
			
		}
		void issues(){
			System.out.println("Enter Book Name : ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			System.out.println("Enter Book ID : ");
			a = sc.nextInt();
			System.out.println("Enter Issue Date : ");
			b= sc.nextInt();
			System.out.println("Total number of books issued : ");
			c= sc.nextInt();
			System.out.println("Return book date : ");
			date=sc.nextInt();
			System.out.println("Your  Details are : ");
			System.out.println(str);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(date);
			
		}
		int getid(){
			return a;
		}
		void ret(){
			System.out.println("Enter Student Name ");
			Scanner sc = new Scanner(System.in);
			String name =sc.nextLine();
			System.out.println("Enter Book ID ");
			int bookid = sc.nextInt();
			if(a == bookid){
				System.out.println("********TOTAL DETAILS ***********");
				System.out.println("Book Name : "+str);
				System.out.println("Book ID : "+a);
				System.out.println("Issue Date : "+b);
				System.out.println("Total number of book Issued : "+c);
				System.out.println("Book Return Date are : "+date);
			}
			else{
				System.out.println("Wrong ID !!!");
				System.out.println("Please Enter the correct ID :)");
			}
		}
		void details(){
			System.out.println("********TOTAL DETAILS ***********");
			System.out.println("Book Name : "+Library.str);
			System.out.println("Book ID : "+Library.a);
			System.out.println("Issue Date : "+Library.b);
			System.out.println("Total number of book Issued : "+Library.c);
			System.out.println("Book Return Date are : "+Library.date);
			
		}
	}

