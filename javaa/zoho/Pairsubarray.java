import java.util.*;
public class Pairsubarray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array : ");
		int n = sc.nextInt();
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		int a[] = new int[];
		System.out.println("Enter the array : ");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				for(int k=j+1;k<a.length;k++){
					if(a[i] + a[j] == sum )		
						System.out.println("The Two sum pair are "+a[i]+"and"+a[j]);
					if(a[i] + a[j] + a[k] == sum )
						System.out.println("The three sum pair are "+a[i]+" + "+a[i]+" + "+a[k]);
					}
			}
		}
	}
}