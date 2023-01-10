import java.util.*;
public class T1{
public static void main(String[] args)
{
int sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no of array :");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter a no of array : ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
sum =arr[0];
for(int i=1;i<arr.length;i++)
{
	if(arr[i] %2 == 1 && arr[i-1]%2 == 0)
	{
		continue;
	}
	else{
		sum+=arr[i];
	}
}
System.out.println(sum);
}
}
/*arr=[3,6,4,8,5,5]
sum = 0
for i in range(len(arr)):
    # to skip 
    if arr[i]%2==1 and arr[i-1]%2==0: continue

    # else add to sum
    else: sum += arr[i];  
print(sum)*/