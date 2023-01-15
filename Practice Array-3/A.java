class A
{
int x,y;
void getdata(int a,int b)
{
	x=a;
	y=b;
}
int add()
{
System.out.println("Super class method");
return (x+y);
}
}
class B extends A
{
int mul()
{
System.out.println("Sub class method");
return (x*y);
}
}
class Test
{
public static void main(String args[])
{
B obj = new B();
int add,mul;
add = obj.add();
mul = obj.mul();
System.out.println("Addition : "+add);
System.out.println("Multiplication :"+mul);
}
} 