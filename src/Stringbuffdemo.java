public class Stringbuffdemo
{
    public static void main(String[] args)
    {
        StringBuffer bfr= new StringBuffer("Hari");
        bfr.append(" haran");
        bfr.replace(0,4,"vignesh");
        bfr.delete(8,10);
        System.out.println(bfr);
    }
}
