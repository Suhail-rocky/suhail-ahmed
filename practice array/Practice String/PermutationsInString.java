import java.util.*;
public class PermutationsInString
{	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String ");
	char str[]=sc.next().toCharArray();
	printpermute(str,0,str.length-1);
}
public static void printpermute(char str[], int l,int r)
{
	if(l == r)
	{
		System.out.println(Arrays.toString(str));
		 return;
	}
	
	for(int i=l;i<=r;i++){
	swap(str,i,l);
	printpermute(str,l+1,r);
	swap(str,i,l);
	}
}
public static  void swap(char str[],int i,int j)
{
			char temp = str[i];
			str[i]=str[j];
			str[j] = temp;	
}


}
