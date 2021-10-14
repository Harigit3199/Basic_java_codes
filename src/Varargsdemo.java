class iCalc
{
    public int add(int ... n)
    {
        int sum=0;
        for(int i:n)
        {
            sum = sum + i;
        }
        return sum;
    }
}
public class Varargsdemo
{
    public static void main(String args[])
    {
        iCalc obj = new iCalc();
        System.out.println(obj.add(4,5,6,7,5,23,12,21));
    }
}
