import java.util.*;
import java.io.*;
public class StudentInformation
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Module m = new Module();
		m.studentInformation();
		Copy c = new Copy();
		//c.add();
		
		
	}
}
class Copy
{
	void add()
	{
		ArrayList<String> copy1 = new ArrayList<String>();
		copy1.add("1");
		copy1.add("suhail");
		copy1.add("1.0");		
		ArrayList<String> copy = new ArrayList<String> (copy1);
		for(int i=0;i<copy.size();i++)
		{
			System.out.println(copy.get(i));
		}
		 Collections.sort(copy,Collections.reverseOrder());
		 for(int i=0;i<copy.size();i++)
		{
			System.out.println(copy.get(i));
		}
		Collections.shuffle(copy);
		for(int i=0;i<copy.size();i++)
		{
			System.out.println(copy.get(i));
		}
	}
	
	
}
class Student implements Comparable<Student>
{
	String name;
	int rollNo;
	int marks;
	int Sno;
	Student(String name,int rollNo,int marks,int Sno)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.Sno=Sno;
		
	}
	public String toString()
	{
		return "\t"+Sno+"\t"+rollNo+"\t"+name+"\t"+marks;
	}
	public String getName() 
	{
        return name;
	}
	 public int compareTo(Student a) {
        return name.compareTo(a.getName());
    }
}
class Module
{
	Scanner sc = new Scanner(System.in);
	static int roll=1001,sn=1;
	  static ArrayList<Student> stud = new ArrayList<Student>();
	public void add()
	{
		System.out.println("Enter a no of students to add :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
				System.out.println("Enter a name : ");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.println("Enter a marks : ");
				int marks = sc.nextInt();
				Student s = new Student(name,roll,marks,sn);
				stud.add(s);
				roll++;
				sn++;
		}
		
	}
	public void view()
	{
		System.out.println("\tsno \tRollNo \tname \tMarks");
		for(int i=0;i<stud.size();i++)
		{
			System.out.println(stud.get(i));
		}
	}
	public void update()
	{
		System.out.println("Enter a Roll no to update :");
		int rolls = sc.nextInt();
		for(int i=0;i<stud.size();i++)
		{
			if(stud.get(i).rollNo == rolls)
			{
				System.out.println("Enter 1.Rollno 2.Name 3.Marks");
				int r=sc.nextInt();
				switch(r)
				{
					case 1:
						System.out.println("Enter a rollno to change :");
						int croll = sc.nextInt();
						stud.get(i).rollNo=croll;
						break;
					case 2:
						System.out.println("Enter a Name to change :");
						String cname = sc.next();
						stud.get(i).name=cname;
						break;
					case 3:
						System.out.println("Enter a Marks to change :");
						int cMarks = sc.nextInt();
						stud.get(i).marks=cMarks;
						break;
				}
			}
		}
	}
	public void delete()
	{
		int change=0;
		System.out.println("Enter a rollno to delete ");
		int rollno = sc.nextInt();
		for(int i=0;i<stud.size();i++)
		{
		if(stud.get(i).rollNo == rollno)
		{
			change=i;
			stud.remove(change);
			System.out.println("Removed Sucessfully");
		}
		}
	}
	public void Serialwisedelete()
	{
		int change=0;
		System.out.println("Enter a Serial number  to delete ");
		int serialNo = sc.nextInt();
		for(int i=0;i<stud.size();i++)
		{
		if(stud.get(i).Sno == serialNo)
		{
			change=i;
			stud.remove(change);
			System.out.println("Removed Sucessfully");
		}
		}
	}
	public void viewOnly()
	{
		int check=0;
		System.out.println("Enter a rollno to viewOnly ");
		int rollno = sc.nextInt();
		for(int i=0;i<stud.size();i++)
		{
			if(stud.get(i).rollNo == rollno)
			{
				check=i;	
			}
		}
		System.out.println("\tRollNo \tname \tMarks");
		System.out.println(stud.get(check));
	}
		
	public void sortAscending()
	{
		System.out.println("Sorting by Name");  
		Collections.sort(stud);
		view();
	}
	public void sortdecending()
	{
		System.out.println("Sorting by Name");  
		Collections.reverse(stud);
		view();
	}
	public void studentInformation()
	{
		int n=0;
		do
		{	
			System.out.println("Enter 1.add 2.view 3.update 4.Delete 5.View only 6.Serial Wise Delete 7.Ascending Order 8.Descending Order 9.Exit ");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					add();
					break;
				case 2:
					view();
					break;
				case 3:
					update();
					break;
				case 4:
					delete();
					break;
				case 5:
					viewOnly();
					break;
				case 6:
					Serialwisedelete();
					break;
				case 7:
					sortAscending();
					break;
				case 8:
					 sortdecending();
					 break;
				default:
					System.out.println("Try Again");
					break;
			}
		}while(n != 9);
				
	}
	
}