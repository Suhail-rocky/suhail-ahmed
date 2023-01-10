import java.util.*;
//task_23
public class Balloon_Color_Matrix{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int m,n,i,j;
	char a1;
	System.out.println("Enter a no of rows and columns");
	m=sc.nextInt();
	n=sc.nextInt();
	System.out.println("Enter the elements of the array :");
	String a[][] = new String[m][n];
	a[0][0]="-";
	a[0][1]="-";
	a[0][2]="-";
	a[1][0]="-";
	a[1][1]="-";
	a[1][2]="-";
	a[2][0]="-";
	a[2][1]="-";
	a[2][2]="-";
	
	for(i=0;i<m;i++)
	{
	for(j=0;j<n;j++)
	{
	System.out.print(a[i][j] +" ");
	}
	System.out.println();
	}
	do {
	System.out.println("Enter a row no ");
	int b= sc.nextInt();
	System.out.println("Enter a colum no ");
	int c = sc.nextInt();
	System.out.println("Enter a color Baloon");
	a[b][c]=sc.next();
	
	for(i=0;i<m;i++)
	{
	for(j=0;j<n;j++)
	{
	System.out.print(a[i][j] +" ");
	}
	System.out.println();
	}
	
	
	System.out.println("Do you want to continue Y/N");
	 a1=sc.next().charAt(0);
	}while(a1 == 'Y');
	}
	}
