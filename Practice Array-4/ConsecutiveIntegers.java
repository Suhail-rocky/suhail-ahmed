import java.util.*;
public class ConsecutiveIntegers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp = 0;
		System.out.println("Enter the array : ");
		for(int i=0;i<a.length;i++)
			a[i] = sc.nextInt();
		for(int i =0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
					if(a[i] == a[j]){
						System.out.println("They are not consecutive Integers");
						break;
					}
			}
		}
		System.out.println("The Consecutive Integers are : ");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
}
					