class Hari
{
    private int age;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class encapage {
    public static void main(String[] args)
    {
        Hari H1= new Hari();

        H1.setAge(22);
        System.out.println("My age is "+ H1.getAge());
    }
}
