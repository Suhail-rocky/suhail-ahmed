class QueueUsingArrays2
{
	static final int MAX_SIZE=30;
	int arr[];
	int rear;
	QueueUsingArrays2()
	{
		arr=new int[MAX_SIZE];
		rear=-1;
	}
	public void enqueue(int val)
	{
		if(rear == MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException("Queue is Full");
		}
		arr[++rear] = val;
	}
	public int dequeue()
	{
		if(rear == -1)
			throw new IndexOutOfBoundsException("Queue is Empty");
	int temp = arr[0];
	for(int i=1;i<=rear;i++)
	{
		arr[i-1]=arr[i];
	}
	rear--;
	return temp;
	}
	
}
class Queue1
{
	public static void main(String[] args)
	{
		QueueUsingArrays2 queue = new QueueUsingArrays2();
		queue.enqueue(10);
		queue.enqueue(22);
		System.out.println(queue.dequeue());
	}
}