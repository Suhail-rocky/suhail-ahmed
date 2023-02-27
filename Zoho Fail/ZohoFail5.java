import java.util.Scanner;
class ZohoFail5
{
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		System.out.println("Enter th M x N matrix");
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println("Enter the numbers :");
		int a[][] =  new int[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=scan.nextInt();
       int rowStart = 0, rowEnd = a.length;
       int colStart = 0, colEnd = a[0].length;
       
       while(rowStart < rowEnd && colStart < colEnd)
       {
         //print top row (left to right)
         for(int i= colStart;i<colEnd;i++)
           System.out.print(a[rowStart][i]+ " ");
           
          rowStart+=1;
           
         //print right column (top to bottom)
         for(int i=rowStart;i<rowEnd;i++)
           System.out.print(a[i][colEnd - 1] + " ");
          
          colEnd-=1;
          
         // print bottom row (right to left)
         for(int i = colEnd - 1;i >= colStart;i--)
           System.out.print(a[rowEnd - 1][i] + " ");
           
          rowEnd-=1;
           
          // print left column (bottom to top)
          for(int i = rowEnd - 1;i >= rowStart;i--)
           System.out.print(a[i][colStart]+ " ");
           
          colStart+=1;
          
       }
    }
}
