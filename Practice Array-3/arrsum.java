import java.util.Scanner;
public class arrsum {
		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element : ");
		int n= sc.nextInt();
		System.out.println("Enter the Sum : ");
		int sum = sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("("+arr[i]+"&"+arr[j]+")");
				}
			}
		}
	  }
	}
