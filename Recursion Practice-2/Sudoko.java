import java.util.Scanner;
public class Sudoko {
    public static void main(String[] args) {
        char board[][] = new char[][]
                {       {'7', '.', '.', '.', '.', '.', '2', '.', '.'},
                        {'4', '.', '2', '.', '.', '.', '.', '.', '3'},
                        {'.', '.', '.', '2', '.', '1', '.', '.', '.'},
                        {'3', '.', '.', '1', '8', '.', '.', '9', '7'},
                        {'.', '.', '9', '.', '7', '.', '6', '.', '.'},
                        {'6', '5', '.', '.', '3', '2', '.', '.', '1'},
                        {'.', '.', '.', '4', '.', '9', '.', '.', '.'},
                        {'5', '.', '.', '.', '.', '.', '1', '.', '6'},
                        {'.', '.', '6', '.', '.', '.', '.', '.', '8'}
                };
        solveSudoko(board);
        print(board);


    }
    static void print(char board[][])
    {
        for(int i=0;i<board[0].length;i++)
        {
            for(int j=0;j< board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void solveSudoko(char[][] board)
    {
        helper(board,0,0);

    }
    public static boolean helper(char board[][],int row,int col)
    {
        if(row == board.length)
        {
            return true;
        }
        int nrow=0;
        int ncol=0;
        if(col == board.length-1)
        {
            nrow = row+1;
            ncol=0;
        }
        else
        {
            nrow=row;
            ncol=col+1;
        }
        if(board[row][col] != '.')
        {
            if(helper(board,nrow,ncol))
            {
                return true;
            }
            else {
                for(int i=1;i<=9;i++)
                {
                    if(isSafe(board,row,col,i))
                    {
                        board[row][col] =(char)(i +'0');
                        if(helper(board,nrow,ncol))
                        {
                            return true;
                        }
                        else
                        {
                            board[row][col]='.';
                        }
                    }
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col,int number)
    {
        //column
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==(char)(number+'0'))
            {
                return false;
            }
        }
        //row
        for(int i=0;i<board.length;i++)
        {
            if (board[row][i] == (char) (number + '0'))
            {
                return false;
            }
        }
        //grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sr;j<sc+3;j++)
            {
                if (board[i][j]==(char)(number+'0'))
                {
                    return false;
                }
            }
        }
        return true;
    }

}
