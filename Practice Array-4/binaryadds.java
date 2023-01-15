import java.util.*;
public class binaryadds{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	int digit1,digit2,sum=0,carry=0,i;
	int arr[] = new int[10];
	System.out.println("Enter first binary number : ");
	num1 = sc.nextInt();
	System.out.println("Enter second binary number : ");
	num2 = sc.nextInt();
	for(int j=arr.length-1;j<=0;j--){
	digit1 = num1 % 10;
	digit2 = num2 % 10;
	num1 = num1 /10;
	num2 = num2 /10;

	sum = digit1+digit2+carry;
	if(sum == 0){
	arr[j] = 0;
	carry = 0;
	}
	else if(sum == 1)
	{
	arr[j] = 1;
	carry = 0;
	}
	else if(sum == 2)
	{
	arr[j] = 0;
	carry = 1;
	}
	else if(sum == 3){
	arr[j] = 1;
	carry = 1;
	}
	}
	for(int j=0;j<arr.length;j++)
	{
	System.out.print(arr[j]);
	}
}
}
