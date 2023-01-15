import java.util.*;
public class Inputints{
	public static void Input(){
	Scanner sc = new Scanner(System.in);
	int count=0,count1=0,count2=0,count3=0,count4=0;
	System.out.println("Enter the number of array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the array ");
	for(int i=0;i<arr.length;i++)
		arr[i] = sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
			count++;
		if(arr[i]<0)
			count1++;
		if(arr[i] %2 == 0)
			count2++;
		if(arr[i] %2 != 0)
			count3++;
		if(arr[i] == 0)
			count4++;
	}
	System.out.println("The number of positive integers are  "+count);
	System.out.println("The number of negative numbers are "+count1);
	System.out.println("The number of even numbers are : "+count2);
	System.out.println("the numbers of Odd numbers are : "+count3);
	System.out.println("The numbers of Zeros are : "+count4);
	}
	public static void main(String[] args){
		Inputints i = new Inputints();
		Input();
		
		}
	}
