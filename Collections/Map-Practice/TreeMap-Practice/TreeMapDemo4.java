import java.util.TreeMap;
import java.util.Scanner;
class TreeMapDemo4
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of students :");
		int n = sc.nextInt();
		TreeMap<Integer,String> studentsMarks = new TreeMap<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a student name :");
			String name = sc.next();
			System.out.println("Enter a student marks : ");
			int marks = sc.nextInt();
			studentsMarks.put(marks,name);
		}
		System.out.println("Descending order of the tree map : "+studentsMarks.descendingMap());
		System.out.println("headMap : "+studentsMarks.headMap(35,true));
		System.out.println("tailMap : "+studentsMarks.tailMap(35,true));
		System.out.println("subMap : "+studentsMarks.subMap(35,false,50,true));
	}
}