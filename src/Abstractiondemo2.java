abstract class MotorBike
{
    abstract void Brake();
}
class sportbike extends MotorBike
{
    public void Brake()
    {
        System.out.println("SportBike Brake");
    }
}
class streetbike extends MotorBike
{
    public void Brake()
    {
        System.out.println("streetBike Brake");
    }
}
class Abstractiondemo2
{
    public static void main(String args[])
    {
        streetbike s1 = new streetbike();
        s1.Brake();
        sportbike s2 = new sportbike();
        s2.Brake();
    }
}








