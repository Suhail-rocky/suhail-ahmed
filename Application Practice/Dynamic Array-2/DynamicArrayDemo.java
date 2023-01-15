import java.util.*;
public class DynamicArrayDemo
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		DynamicArrayDemo d = new DynamicArrayDemo();
		d.arrayManipulations();
	}
	public void arrayManipulations()
	{
		int choice=0;
		DynamicArray list = new DynamicArray();
		do
		{
			System.out.println("1.add 2.view 3.Insert at Position  4.delete at position   5.delete at End 6.delete at Begining 7.Insert At beginning 8.get 9.update 10.search 11.clear 12.contains 13.Exit");
			choice = sc.nextInt();
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
				case 3:
					System.out.println("Enter a position :(from 0)");
					int position = sc.nextInt();
					System.out.println("Enter a Value :");
					int value=sc.nextInt();
					list.insertAtPos(position,value);
					break;
				case 4:
					System.out.println("Enter a position :(from 0) to delete");
					position = sc.nextInt();
					list.deleteAtPos(position);
					break;
				case 5:
					list.deleteAtEnd();
					break;
				case 6:
					list.deleteAtbegin();
					break;
				case 7:
					System.out.println("Enter a value to add in a beginning :");
					value = sc.nextInt();
					list.insertAtBeginning(value);
					break;
				case 8:
					System.out.println("Enter a value to display :");
					int index = sc.nextInt();
					list.get(index);
					break;
				case 9:
					System.out.println("Enter a index and value to update :");
					index = sc.nextInt();
					value=sc.nextInt();
					list.update(index,value);
					break;
				case 10:
					System.out.println("Enter a Value to search :");
					value = sc.nextInt();
					int ans = list.search(value);
					System.out.println(ans);
					break;
				case 11:
					list.clear();
					break;
				case 12:
					System.out.println("Enter a Value to search :");
					value = sc.nextInt();
					boolean res=list.contains(value);
					System.out.println(res);
					break;
					
			}
		}while(choice != 13);
	}
}
class DynamicArray
{
	private static final int initialCapacity=16; 
	private int arr[];
	private int size;
	private int capacity;
	
	DynamicArray()
	{
		size=0;
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
		System.out.println("No of arrays are;");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void insertAtPos(int position,int value)
	{
		if(size == capacity)
			expandArray();
		for(int i=size-1;i>=position;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[position]=value;
		size++;
	}
	public void deleteAtPos(int position)
	{
		for(int i=position+1;i<size;i++)
		{
			arr[i-1]=arr[i];
			
		}
		size--;
		if(capacity > initialCapacity && capacity > 3*size)
		{
			shrinkArray();
		}
			
	}
	private void shrinkArray()
	{
		capacity /= 2;
		arr=java.util.Arrays.copyOf(arr,capacity);
	}
	public void deleteAtEnd()
	{
		int position=size-1;
		for(int i=position+1;i<size;i++)
		{
			arr[i-1]=arr[i];
			
		}
		size--;
	}
	public void deleteAtbegin()
	{
		int position=0;
		for(int i=position+1;i<size;i++)
		{
			arr[i-1]=arr[i];
			
		}
		size--;
	}
	public void insertAtBeginning(int value)
	{
		int position=0;
		if(size == capacity)
			expandArray();
		for(int i=size-1;i>=position;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[position]=value;
		size++;
	}
	public void get(int index)
	{
		System.out.println(arr[index]);
	}
	public void update(int index,int value)
	{
			arr[index]=value;
	}
	public int search(int value)
	{
		int i=0;
		for(i=0;i<size;i++)
		{
			if(arr[i] == value)
			{
				return i;
			}
					
		}
		return i;
	}
	public void clear()
	{
		size=0;
	}
	public boolean contains(int value)
	{
		boolean flag = false;
		for(int i=0;i<size;i++)
		{
			if(arr[i] == value)
			{
				flag = true;
				return flag;
			}		
		}
		return flag;
	}
	


}
	