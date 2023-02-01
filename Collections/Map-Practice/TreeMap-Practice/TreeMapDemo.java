import java.util.TreeMap;
import java.util.Scanner;
class TreeMapDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of students : ");
		int n = sc.nextInt();
		TreeMap<Integer,String> Studentsdetails = new TreeMap<>();
		int rollno = 1001;
		for(int i=0;i<n;i++)
		{
			String name = sc.next();
			Studentsdetails.put(i+rollno,name);
		}
		System.out.println(Studentsdetails);
		System.out.println("Enter the roll no that you want to replace :");
		rollno = sc.nextInt();
		Studentsdetails.remove(rollno);
		System.out.println(Studentsdetails);
		System.out.println("Enter the roll no that you want to replace :");
		rollno = sc.nextInt();
		System.out.println("Enter a name that you want to replace : ");
		String name = sc.next();
		Studentsdetails.replace(rollno,name);
		System.out.println(Studentsdetails);
	}

}
