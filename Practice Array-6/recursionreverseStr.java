/*Input : one two three
Output : three two one */
import java.util.*;
public class recursionreverseStr
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String : ");
String s = sc.nextLine();

char a[]=s.toCharArray();
int start=0,end=0;
Reverse(a,0,a.length-1);
for(end=0;end<a.length;end++)
if(a[end] == ' ')
{
Reverse(a,start,end-1);
start=end+1;
}
Reverse(a,start,end-1);
System.out.println(a);
}
public static void Reverse(char a[],int start,int end){
for(;start<end;start++,end--){
char temp=a[start];
a[start]=a[end];
a[end]=temp;
}
}
}