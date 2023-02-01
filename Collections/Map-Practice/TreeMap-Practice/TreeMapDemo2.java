import java.util.TreeMap;
import java.util.Scanner;
class TreeMapDemo2
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
		Object entrySet = Studentsdetails.entrySet();
		System.out.println("Student Details  : "+entrySet);
		System.out.println("Roll no : "+Studentsdetails.keySet());
		System.out.println("Name : "+Studentsdetails.values());
		System.out.println("Enter a rollno : ");
		int rno = sc.nextInt();
		Object vGet = Studentsdetails.get(rno);
		System.out.println("Student name is : "+vGet);
		System.out.println("Enter a roll no is present or not  :");
		rno = sc.nextInt();
		boolean containsKey = Studentsdetails.containsKey(rno);
		System.out.println("is rollno "+rno+" present in map : "+containsKey);
		System.out.println("Enter a name is present or not : ");
		String name = sc.next();
		boolean containsValue = Studentsdetails.containsValue(name);
		System.out.println("is "+name+" present in Student details :"+containsValue);
		
	}
}