import java.util.*;
public class coordinators
{
public static void main(String args[])
{
System.out.println("Enter the number of array : ");
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int arr[] = new int[10];
System.out.println("Enter the array : ");
for(int i=0;i<s;i++)
{
arr[i]=sc.nextInt();
}
if(arr[i+1]>arr[i])
{
System.out.println(arr[i+1]);
}
}
}

