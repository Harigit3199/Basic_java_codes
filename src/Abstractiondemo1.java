abstract class iPhone
{
    abstract void makeRingtone();

    public void play() {
        System.out.println("I can play");

    }
}
class Apple extends iPhone {
    public void makeRingtone() {
        System.out.println("Ting Tong");
    }

}
public class Abstractiondemo1
{
    public static void main(String args[])
    {
        Apple obj1 = new Apple();

        obj1.makeRingtone();
        obj1.play();
        
    }
}
