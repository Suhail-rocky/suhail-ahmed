// Java program to illustrate
// Burst balloon problem
import java.util.*;
class Burstballoon{

public static int getMax(int[] A, int N)
{
	int[] B = new int[N + 2];
	B[0] = B[N + 1] = 1;
		
	for(int i = 1; i <= N; i++)
		B[i] = A[i - 1];
	
	int[][] dp = new int[N + 2][N + 2];
	
	for(int length = 1;
			length < N + 1; length++)
	{
		for(int left = 1;
				left < N - length + 2; left++)
		{
			int right = left + length -1;
			for(int last = left;
					last < right + 1; last++)
			{
				dp[left][right] = Math.max(	dp[left][right],dp[left][last - 1] +B[left - 1] * B[last] *B[right + 1] +dp[last + 1][right]);
			}
		}
	}
	return dp[1][N];
}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array :");
	int n = sc.nextInt();
	int[] A = new int[n];
	System.out.println("Enter a array");
	for(int i=0;i<n;i++)
	{
		A[i]=sc.nextInt();
	}
	int N = A.length;
	System.out.println(getMax(A, N));
}
}

