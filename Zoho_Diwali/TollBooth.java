import java.util.*;
class TollBooth
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int cnt=0,paidcnt=0;
do
{
if(n==1||n==2)
{
if(n==1)
{
paidcnt++;
}
cnt++;
}
n=s.nextInt();
if(n==3||n==4||n>5)
{
break;
}
}while(n!=5);
int Totalpaidcnt=cnt-paidcnt;
System.out.println(cnt+"\n"+paidcnt+"\n"+Totalpaidcnt);
System.out.println(paidcnt*50);
}
}