class outer {
    int a;

    public void show() {
        System.out.println("print hari");
    }

}
class inner
{
    public void display()
    {
        System.out.println("print display");
    }
}

public class innerclassdemo
{
    public static void main(String args[])
    {
        outer obj = new outer();
        obj.show();

        inner obj1 =new inner();
        obj1.display();
    }
}