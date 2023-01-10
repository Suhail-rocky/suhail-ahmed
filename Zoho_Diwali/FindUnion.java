import java.util.*;
class Task_4
{
	static int printUnion(int arr1[], int arr2[], int m, int n)
	{
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				System.out.print(arr1[i++] + " ");
			else if (arr2[j] < arr1[i])
				System.out.print(arr2[j++] + " ");
			else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}
		while (i < m)
			System.out.print(arr1[i++] + " ");
		while (j < n)
			System.out.print(arr2[j++] + " ");

		return 0;
	}

	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array1 :");
		int m = sc.nextInt();
		System.out.println("Enter a no of array2 :");
		int n = sc.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		System.out.println("Enter a array1");
		for(int i=0;i<m;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter a array2");
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		printUnion(arr1, arr2, m, n);
	}
}
