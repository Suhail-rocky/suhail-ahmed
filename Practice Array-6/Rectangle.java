import java.util.*;
class Rectangle
{
	int height;
	int width;
	void display(int h,int w)
	{
		System.out.println(h+" "+w);
	}
}
class RectangleArea extends Rectangle
{
 void display(int h, int w)
 {
	 System.out.println(h*w);
 }
}
class Test{
 public static void main(String[] args)
 {	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Height  :");
	int h = sc.nextInt();
	System.out.println("Enter the Weight  :");
	int w = sc.nextInt();
	Rectangle rec = new Rectangle();
	rec.display(h,w);
	}
}