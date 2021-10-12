class casio{
    public void add(int i, int j)
    {
        System.out.println(i+j);
    }
    public void add(int i,int j,int k)
    {
        System.out.println(i+j+k);
    }
    public void add(double i , double j)
    {
        System.out.println(i+j);
    }
}
public class overloaddemo {
    public static void main(String args[])
    {
        casio obj = new casio();
        obj.add(20,21);
        obj.add(50,56,5);
        obj.add(50.5,20.2);
    }
}
