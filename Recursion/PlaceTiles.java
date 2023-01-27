import java.util.Scanner;
public class PlaceTiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a tiles row position : ");
        int n=sc.nextInt();
        System.out.println("Enter a tiles column position : ");
        int m=sc.nextInt();
        System.out.println(placeTiles(n,m));
    }
    /*static int placeTiles(int n,int m)
    {
        if (n < m)
        {
            return 1;
        }
        else   if(n == m)
        {
            return 2;
        }
        // vertical Tiles setting
        int verticalPlace=placeTiles(n-1,m);
        // horizontal Tiles setting
        int horizontalPlace=placeTiles(n-m,m);
        int tiles=verticalPlace+horizontalPlace;
        return tiles;
    }*/
    static int placeTiles(int n,int m)
    {
        if (n < m)
            return 1;
        else if (n == m)
            return 2;
        return placeTiles(n - 1, m) + placeTiles(n - m, m);
   }
}
