import java.util.TreeMap;
import java.util.Scanner;
class TreeMapDemo3
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
		System.out.println(studentsMarks);
		System.out.println("ceiling Entry : "+studentsMarks.ceilingEntry(35));
		System.out.println(studentsMarks);
		System.out.println("ceiling Key : "+studentsMarks.ceilingKey(35));
		System.out.println(studentsMarks);
		System.out.println("firstEntry : "+studentsMarks.firstEntry());
		System.out.println(studentsMarks);
		System.out.println("lastEntry : "+studentsMarks.lastEntry());
		System.out.println(studentsMarks);
		System.out.println("floorEntry :"+studentsMarks.floorEntry(35));
		System.out.println(studentsMarks);
		System.out.println("HigherEntry : "+studentsMarks.higherEntry(35));
		System.out.println(studentsMarks);
		System.out.println("LowerEntry : "+studentsMarks.lowerEntry(35));
		System.out.println(studentsMarks);
		System.out.println("pollFirstEntry : "+studentsMarks.pollFirstEntry());
		System.out.println(studentsMarks);
		System.out.println("pollLastEntry : "+studentsMarks.pollLastEntry());
		System.out.println(studentsMarks);
	}
}
	