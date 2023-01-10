import java.util.*;
public class RotateArray
{
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args)
{
	int i, N;
	System.out.println("enter a no of array :");
	int SIZE = sc.nextInt();
    int arr[] = new int[SIZE];
    System.out.printf("Enter "+SIZE+" elements array: ");
    for(i=0; i<SIZE; i++)
    {
       arr[i]=sc.nextInt();
    }
    System.out.printf("Enter number of times to left rotate: ");
    N=sc.nextInt();

    /* Actual rotation */
    N = N % SIZE;

    /* Print array before rotation */
    System.out.printf("Array before rotationn");
    printArray(arr,SIZE);

    /* Rotate array n times */
    for(i=1; i<=N; i++)
    {
        rotateByOne(arr,SIZE);
    }

    /* Print array after rotation */
    System.out.printf("\n\nArray after rotation\n");
    printArray(arr,SIZE);

    
}



    
static void rotateByOne(int arr[],int SIZE)
{
    int i, first;

    /* Store first element of array */
    first = arr[0];

    for(i=0; i<SIZE-1; i++)
    {
        /* Move each array element to its left */
        arr[i] = arr[i + 1];
    }

    /* Copies the first element of array to last */
    arr[SIZE-1] = first;
}


/**
 * Print the given array
 */
static void printArray(int arr[],int SIZE)
{
    int i;

    for(i=0; i<SIZE; i++)
    {
       System.out.printf("%d ", arr[i]);
    }
}
}