public class SortingString
{
	public static void main(String[] args)
	{
	char[] sortedpat = {'B','A','C','D'};
        //Arrays.sort(sortedpat);
		for(int i=0;i<sortedpat.length;i++)
		{
			for(int j=i+1;j<sortedpat.length;j++)
			{
				if(sortedpat[i] > sortedpat[j])
				{
					char temp = sortedpat[i];
					sortedpat[i]=sortedpat[j];
					sortedpat[j]=temp;
				}
			}
		}
		System.out.println(new String(sortedpat));
	}
}