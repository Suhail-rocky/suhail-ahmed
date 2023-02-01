import java.util.Scanner;
public class FindPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  no of row :");
        int r = sc.nextInt();
        System.out.println("Enter a no of columns : ");
        int c = sc.nextInt();
        int maze[][]=new int[r][c];
        System.out.println(findPath(maze,0,0,r,c));
    }
    public static int findPath(int maze[][],int row,int col,int m,int n)
    {
        int count=0;
        if(row == m|| col == n)
            return 1;
        if(row == m-1 && col == n-1)
        {
            return 0;
        }
        int downwards = findPath(maze, row + 1, col, m, n);
        int rightwards = findPath(maze,row,col+1,m,n);
        count=downwards+rightwards;
        return count;
    }

}
