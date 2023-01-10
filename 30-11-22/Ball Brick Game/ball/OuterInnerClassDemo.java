public class OuterInnerClassDemo {
    public static void main(String[] args) {
        //three ways for creating inner class objects
        Outer o =new Outer();
        Outer.Inner i = o.new Inner();
        i.m1();
        Outer.Inner j=new Outer().new Inner();
        new Outer().new Inner().m1();
    }


}
class Outer{

    class Inner
    {
        void m1()
        {
            System.out.println("m1 is calling...");
        }
    }
}