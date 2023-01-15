import java.util.*;
class diagonal {
	public static void main(String[] args) {
	int len,mid,i,j;
	System.out.println("Enter the n value of the string: ");
	
      	Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] word = new char[100];
        word = s.toCharArray();
        char[] a=new char[100];
        a=s.toCharArray();
        int count=0;
        int n = s.length();
        int k = s.length()-1;

	mid=n/2;
	for(i=mid;i<n;i++)
	a[k++]=word[i];
	for(i=0;i<n;i++)
	a[k++]=word[i];
	for(i=0;i<n;i++)
	k=0;
	for(j=0;j<n;j++)
	{
	if(j<n-1)
	System.out.print("*");
	if(j>=n-1)
	System.out.print(word[k++]);
	}
	n--;
	System.out.println();
return;
}
}