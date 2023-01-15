import java.util.Scanner;

public class Zero {
	static void pushZerosToEnd( int arr[], int n)
	{
	int count = 0 ;
	for ( int i = 0 ; i < n; i++)
	if (arr[i] != 0 )
	arr[count++] = arr[i];
	while (count < n)
	arr[count++] = 0 ;
	}
	static void modifyAndRearrangeArr( int arr[], int n)
	{
	if (n == 1 )
	return ;
	for ( int i = 0 ; i < n - 1 ; i++) {
	if ((arr[i] != 0 ) && (arr[i] == arr[i + 1 ]))
	{
	arr[i] = 2 * arr[i];
	arr[i + 1 ] = 0 ;
	i++;
	}
	}
	pushZerosToEnd(arr, n);
	}
	static void printArray( int arr[], int n)
	{
	for ( int i = 0 ; i < n; i++)
	System.out.print(arr[i] + " " );
	System.out.println();
	}
	public static void main(String[] args)
	{
	//int arr[] = { 0 , 2 , 2 , 2 , 0 , 6 , 6 , 0 , 0 , 8 };
		System.out.println("Enter the number of array :");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int [size];
		System.out.println("Enter the number of elements : ");		
		for(int i=0;i<size;i++)
		{
		arr[i]=s.nextInt();
		}
	int n = arr.length;
	System.out.print( "Original array: " );
	printArray(arr, n);
	modifyAndRearrangeArr(arr, n);
	System.out.print( "Modified array: " );
	printArray(arr, n);
	}
}
