import java.util.Scanner;


public class Balloon_Matrix_Module_2 {

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
    	   
           System.out.println("Enter a Column number : ");
           int j= sc.nextInt();
           j =j-1;
           System.out.println("Enter a Balloon Colour : ");
           arr[arr.length-1][1] = sc.next();
           if( c == 0){
           for(int i=0;i<m;i++)
           {
               for(j=0;j<n;j++)
               {
               	System.out.print(arr[i][j]+" ");
               }
               System.out.println();
           }
           c++;
           }
           System.out.println(c);
           if(c == 1)
           {
        	   System.out.println("Enter a Column number : ");
               j= sc.nextInt();
               j =j-1;
               System.out.println("Enter a Balloon Colour : ");
               arr[arr.length-2][j] = sc.next();
               for(int i=0;i<m;i++)
               {
                   for(j=0;j<n;j++)
                   {
                   	System.out.print(arr[i][j]+" ");
                   }
                   System.out.println();
                   
               }
               c++;
        
           }System.out.println("C is :"+c);
           if (c == 2){
        	   System.out.println("Enter a Column number : ");
               j= sc.nextInt();
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
               c++;
        	   
           }
           //System.out.println("N is"+c);
           if(c == 3)
           {
        	   System.exit(0);
           }
     
           System.out.println("Do you want to continue Y/N");
           a1=sc.next().charAt(0);
       }while(a1 == 'Y');
   }

}
