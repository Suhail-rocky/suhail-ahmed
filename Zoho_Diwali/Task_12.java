import java.util.*;

public class Task_12 {
	static int findSubsequenceCount(String S, String T)
	{
		int m = T.length();
		int n = S.length();
		if (m > n)
			return 0;
		int mat[][] = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++)
			mat[i][0] = 0;

		for (int j = 0; j <= n; j++)
			mat[0][j] = 1;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (T.charAt(i - 1) != S.charAt(j - 1))
					mat[i][j] = mat[i][j - 1];

				else
					mat[i][j] = mat[i][j - 1] + mat[i - 1][j - 1];
			}
		}

		
		return mat[m][n];
	}

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String1 :");
		String S = sc.next();
		System.out.println("Enter a String2 :");
		String T = sc.next();
		System.out.println(findSubsequenceCount(S, T));
	}
}

