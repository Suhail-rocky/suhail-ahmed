import java.util.*;
class Fibonacci
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter a number :");
    int n = sc.nextInt();
    int dp_fib[]=new int[n];
        dp_fib[0] = 0;
        dp_fib[1] = 1;
        for(int i = 2; i < n; i++) {
                dp_fib[i] = dp_fib[i-1] + dp_fib[i-2];
        }

        for(int i = 0; i < n; i++) {
                System.out.printf("%d ", dp_fib[i]);
        }
        System.out.printf("\n");
}
}