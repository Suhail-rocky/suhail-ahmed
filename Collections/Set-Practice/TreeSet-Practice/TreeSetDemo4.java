import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(100);
        for(int i=0;i<15;i++)
        {
            ts.add(i);
        }
		System.out.println(ts);
        System.out.println(ts.higher(10));
        System.out.println(ts.lower(1));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println(ts.remove(1));
				System.out.println(ts);
    }
    
}
