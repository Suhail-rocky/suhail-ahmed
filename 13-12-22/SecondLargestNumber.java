import java.util.*;
public class SecondLargestNumber
{
static Scanner sc = new Scanner(System.in);

public static void  main(String[] args)
{
    int size=0, i=0; 
    System.out.println("Enter size of the array : ");
    size = sc.nextInt();
	int arr[] = new int[size];
    System.out.println("Enter elements in the array: ");
    for(i=0; i<size; i++)
    {
       arr[i]=sc.nextInt();
    }
	int max1=arr[0], max2=arr[0];
    for(i=0; i<size; i++)
    {
        if(arr[i] > max1)
        {
            max2 = max1;
            max1 = arr[i];
        }
        else if(arr[i] > max2 && arr[i] < max1)
        {
            max2 = arr[i];
        }
    }
    System.out.printf("First largest = %d\n", max1);
    System.out.printf("Second largest = %d", max2);

}
}
