/*Input: str = “Geeks For Geeks” 
Output: 
For 1 
Geeks 2 
Explanation: 
For occurs 1 time and Geeks occurs 2 times in the given string str.

Input: str = “learning to code is learning to create and innovate” 
Output: 
and 1 
code 1 
create 1 
innovate 1 
is 1 
learning 2 
to 2 
Explanation: 
The words and, code, create, innovate, is occurs 1 time; and learning, to occurs 2 times in the given string str. */
import java.util.*;
public class FrequencyOfEachWord
{
	public static void main(String[] args)
	{
		String temp="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		s+=" ";
		int count=0;
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c[i]==32)
			{
				count++;
			}
		}
		String freq[] = new String[count];
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
				temp+=c[i];
			}
			else
			{
				//System.out.println(temp);
				freq[j]=temp;
				temp="";
				j++;
			}
			
		}
	/*	for(int i=0;i<count;i++)
		{
			System.out.print(freq[i]+" ");
		}*/
		int visited=-1;
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			int count2 = 1;
			for(int k=i+1;k<count;k++)
			{
				if(freq[i].equals(freq[k]))
				{
						count2++;
						arr[k]=visited;
						
				}
			}
				if(arr[i] != visited)
				{
					arr[i]=count2;
				}
			
		}
		for(int i=0;i<count;i++)
		{
			if(arr[i] != -1)
			{
				System.out.print(freq[i]+" -"+arr[i]);
				System.out.println();
			}
		}
		}
}