import java.util.Arrays;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        char str[]=sc.next().toCharArray();
        permutation(str,0,str.length-1);
    }
    static void permutation(char str[],int index,int r)
    {
        if(index == r)
        {
            System.out.println(Arrays.toString(str));
            return;
        }
        for(int i=index;i<=r;i++)
        {
            swap(str,i,index);
            permutation(str,index+1,r);
            swap(str,i,index);
        }
    }
    static void swap(char str[],int i,int j)
    {
        char temp = str[i];
        str[i]=str[j];
        str[j]=temp;
    }
}
