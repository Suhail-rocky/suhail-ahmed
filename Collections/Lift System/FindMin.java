class FindMin
{
	public static void main(String[] args)
	{
	int a[]={1,2,3,4,5};
	int min=10000;
	for(int i=0;i<a.length;i++)
	{
		if(min > a[i])
		{
			min=a[i];
		}
	}
	System.out.println(min);
}
}