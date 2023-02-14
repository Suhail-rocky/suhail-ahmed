import java.util.*;
class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		System.out.println("Enter a array : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(duplicates(arr, n));
		
	}
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        int count=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    list.add(arr[j]);
                }
            
            }
        }
        if(count > 0)
        {
			ArrayList<Integer> newList = new ArrayList<Integer>();
			for(int elemnets : list)
			{
				if(!newList.contains(elemnets))
				{
					newList.add(elemnets);
				}
			}
            Collections.sort(newList);
            return newList;
        }
        else
        {
            list.add(-1);
            return list;
        }
    }
}
