import java.util.*;
class DynamicArray
{
	private static final int initialCapacity=16; 
	private int arr[];
	private int size;
	private int capacity;
	
	DynamicArray()
	{
		size = 0;
		arr = new int[initialCapacity];
		capacity=initialCapacity;
	}
	public void add(int value)
	{
		if(size == capacity)
		{
			expandArray();
		}
		arr[size++]=value;
	}
	private void expandArray()
	{
		capacity *= 2;
		arr=java.util.Arrays.copyOf(arr,capacity);
	}
	public void view()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}


}
class Main
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Main obj = new Main();
		obj.arrayManipulations();
	}
	public void arrayManipulations()
	{
		int choice=0;
		do
		{
			System.out.println("1.add 2.view 3.update 4.delete 5.Exit");
			choice = sc.nextInt();
			DynamicArray list = new DynamicArray();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the data to add :");
					int data=sc.nextInt();
					list.add(data);
					break;
				case 2:
					list.view();
					break;
			}
		}while(choice != 5);
				
	}
}
	