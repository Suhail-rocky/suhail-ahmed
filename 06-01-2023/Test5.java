/*
5) You  are given two non- empty linked list representing two non- negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

Input :

l1 = [1->5->4->9]

l2 = [2->3->5->4]

  Output :

[3->8->9->3->1]

Explanation

9451+ 4532 = 13983
*/
import java.util.*;
public class Test5
{
	public static void main(String[] args)
	{
		String temp="",temp1="";
		int t=0,e=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of elemnets :");
		int n = sc.nextInt();
		LinkedList list = new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a Number ");
			int no = sc.nextInt();
			list.add(no);
		}
		System.out.println("Enter a no of elements :");
		int m = sc.nextInt();
		LinkedList list1 = new LinkedList();
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter a Number ");
			int no = sc.nextInt();
			list1.add(no);
		}
		System.out.println(list);
		System.out.println(list1);
		Collections.reverse(list);
		Collections.reverse(list1);
		System.out.println(list);
		System.out.println(list1);
		for(int i=0;i<list.size();i++)
		{
			temp += list.get(i);
		}
		System.out.println(temp);
		char c[]=temp.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			t = t * 10 + ((int)c[i] - 48);
		}
		System.out.println(t);
		for(int i=0;i<list1.size();i++)
		{
			temp1 += list1.get(i);
		}
		System.out.println(temp1);
		char d[]=temp1.toCharArray();
		for(int i=0;i<d.length;i++)
		{
			e = e * 10 + ((int)d[i] - 48);
		}
		System.out.println(e);
		int ans = t + e;
		String res = "";
		res += ans;
		int g=0;
		char a[]=res.toCharArray();
		LinkedList answers = new LinkedList();
		for(int i=0;i<a.length;i++)
		{
			answers.add(a[i]);
		}
		System.out.println(answers);
		
		
	}
}