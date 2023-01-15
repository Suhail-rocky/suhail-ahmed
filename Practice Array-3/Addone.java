import java.util.*;  
import java.io.*;  
public class Addone {  
  public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number of array : ");
	  int m = sc.nextInt();
	  System.out.println("Enter the array : ");
      int[] arr = new int[m];
	for(int i = 0;i<m;i++)
		arr[i] = sc.nextInt();
      int num=arrayToNum(arr);  
      num=num+1;  
      int[] result=numToArray(num);  
      arr=result;  
      for(int i=0;i<arr.length;i++){  
          System.out.print(arr[i]+" ");  
      }  
  }  
  public static int arrayToNum(int[] arr){  
      int idx=0;  
      int ans=0;  
      for(int i=arr.length-1;i>=0;i--){  
          ans+=arr[i]*Math.pow(10,idx++);  
      }  
      return ans;  
  }  
  public static int[] numToArray(int num){  
      int n=0;  
      int copy_num=num;  
      while(copy_num>0){  
          copy_num/=10;  
          n++;  
      }  
      int[] result=new int[n];  
      int idx=n-1;  
      while(num>0){  
          result[idx--]=num%10;  
          num=num/10;  
      }  
      return result;  
  }  
}  