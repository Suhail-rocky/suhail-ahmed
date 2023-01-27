import java.util.Scanner;
public class FriendPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of guests : ");
        int n = sc.nextInt();
        System.out.println(friendPair(n));
    }
  /*  private static int friendPair(int n)
    {
        if(n <= 1)
            return 1;
        //single
        int ways1 = friendPair(n-1);
        //pair
        int ways2 = (n-1)*friendPair(n-2);
        return ways1+ways2;
    }*/
    static int friendPair(int n)
    {
        if(n<=1)
            return 1;
        return friendPair(n-1)+(n-1)*friendPair(n-2);
    }

}
