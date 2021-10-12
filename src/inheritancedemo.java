class calc
{
    public int add(int i, int j){
        return i +j;
    }
}
class calcadv extends calc
{
    public int sub(int i, int j)
    {
        return i-j;

    }
}

class inheritancedemo
{
    public static void main(String args[])
    {

        calcadv xs = new calcadv();
        int result1 = xs.add(21,23);
        int result2 = xs.sub(52,35);

        System.out.println(result1);
        System.out.println(result2);
    }
}