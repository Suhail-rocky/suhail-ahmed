/*Given an array of words arr[],  The task is to find the most occurring word in arr[].

Examples: 

Input : arr[] = {“geeks”, “for”, “geeks”, “a”, 
                        “portal”, “to”, “learn”, “can”,
                        “be”, “computer”, “science”, 
                        “zoom”, “yup”, “fire”, “in”, 
                        “be”, “data”, “geeks”}
Output : geeks 
Explanation : “geeks” is the most frequent word in the given array occurring 3 times

Input:  arr[] = {“hello”, “world”}
Output: world*/
import java.util.*;
public class MostOccuringWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		s+=" ";
		int count=0;
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c[i] == 32)
			{
				count++;
			}
		}
		String temp="";
		int check=0;
		String frequency[]=new String[count];
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
				temp += c[i];
			}
			else
			{
				frequency[check++]=temp;
				//check++;
				temp="";
			}
		}
		int visited=-1;
		int see=0;
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			int count2=1;
			for(int j=i+1;j<count;j++)
			{
				if(frequency[i].equals(frequency[j]))
				{
					count2++;
					arr[j]=visited;
				}
				
			}
			if(arr[i] != visited)
			{
				arr[i]=count2;
				
			}
		}
		int max=0;
		for(int i=0;i<count;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				see=i;
			}
		}
		
		System.out.println(max);
		System.out.println(frequency[see]+"-"+arr[see]);
		
	}
}

