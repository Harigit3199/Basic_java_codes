abstract class Phone{
    public void display(){
        System.out.println("iPhone 13 pro max");

    }
}
public class AbstractionDemo extends Phone
{
    public static void main(String args[])
    {
        AbstractionDemo obj= new AbstractionDemo();
        obj.display();
    }
}

