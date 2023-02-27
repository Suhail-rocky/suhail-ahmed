import java.util.Scanner;
class XOPattern
{
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		System.out.println("Enter th M x N matrix");
		int m=scan.nextInt();
		int n=scan.nextInt();
		char a[][] =  new char[m][n];
		int rowStart =0,rowEnd = a.length;
       int colStart = 0, colEnd = a[0].length;
       char c='X';
       while(rowStart < rowEnd && colStart < colEnd)
       {
         //print top row (left to right)
         for(int i= colStart;i<colEnd;i++)
           a[rowStart][i]=c;
           
          rowStart+=1;
           
         //print right column (top to bottom)
         for(int i=rowStart;i<rowEnd;i++)
           a[i][colEnd - 1]=c;
          
          colEnd-=1;
          
         // print bottom row (right to left)
         for(int i = colEnd - 1;i >= colStart;i--)
           a[rowEnd - 1][i] =c;
           
          rowEnd-=1;
           
          // print left column (bottom to top)
          for(int i = rowEnd - 1;i >= rowStart;i--)
           a[i][colStart]=c;
           
          colStart+=1;
		  
		  if(c=='X')
			  c='O';
		  else if(c=='O')
			  c='X';
       }
	   for(int i=0;i<m;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   System.out.print(a[i][j]+"");
		   }
		   System.out.println();
	   }
    }
}
