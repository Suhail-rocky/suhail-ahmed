import java.util.TreeSet;
import java.util.Iterator;
class TreeDemo3
{	
	public static void main(String[] args)
	{
		TreeSet<Integer> num = new TreeSet<Integer>();
		for(int i=0;i<10;i++)
		{
			num.add(i);
		}
		TreeSet<Integer> check = new TreeSet<Integer>();
		check =(TreeSet)num.headSet(7);//find number less than 7
		Iterator iterator;
		iterator = check.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		
	}
}