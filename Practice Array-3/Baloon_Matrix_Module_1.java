import java.util.Scanner;


public class Baloon_Matrix_Module_1 {
	 static int count =0;
 	 static int count1=0;
 	 static int c=0;
 	 static int g=0;
	public static void main(String[] args)
    {
        char a1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of rows and columns :");
        int m = sc.nextInt();//rows
        int n = sc.nextInt();//columns
        String arr[][] = new String[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = "-";
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
        do {
        	//System.out.println("The count is"+count);
        	c++;
        	if(c ==1 || c == 2 || c == 3){
            System.out.println("Enter a Column number : ");
            int j= sc.nextInt();
            j =j-1;
            System.out.println("Enter a Balloon Colour : ");
            arr[arr.length-1][j] = sc.next();
            count++;
            for(int i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                	System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        	}
           // System.out.println("The count is"+count);
        	g++;
        	//System.out.println("The g is"+g);
            if(count == 3 && (g == 4|| g == 5|| g == 3)){
            	//System.out.println("The count is"+count);
            System.out.println("Enter a Column number : ");
            int j= sc.nextInt();
            j =j-1;
            System.out.println("Enter a Balloon Colour : ");
            arr[arr.length-2][j] = sc.next();
            count1++;
            for(int i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                	System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            }
           // System.out.println("The count is"+count1);
            if(count1 == 3 || count1 == 4 || count1 == 5){
            	System.out.println("The count is"+count1);
            System.out.println("Enter a Column number : ");
            int j= sc.nextInt();
            j =j-1;
            System.out.println("Enter a Balloon Colour : ");
            arr[arr.length-3][j] = sc.next();
            for(int i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                	System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            }
            System.out.println("Do you want to continue Y/N");
            a1=sc.next().charAt(0);
        }while(a1 == 'Y');
    }

}