import java.util.*;
public class IntToNums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        String temp="";
        intToNums(n,temp);

    }
    public static void intToNums(int n,String temp)
    {
        if(n == 0) {
            System.out.println(temp);
            return;

        }
        if(n>0) {

            char c = (char) ((n - 1) % 26 + 'A');
            intToNums((n - 1) / 26, c + temp);
        }

    }

}
