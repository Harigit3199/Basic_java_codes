class A
{
    public void show()
    {
        System.out.println("hari");
    }
}
class B extends A{
    public void show()
    {
        super.show();
        System.out.println("Apple");
    }
}
public class overridedemo {
    public static void main(String args[])
    {
        B obj1 = new B();
        obj1.show();
    }
}
