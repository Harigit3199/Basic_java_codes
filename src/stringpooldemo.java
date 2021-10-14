public class stringpooldemo
{
    public static void main(String[] args)
    {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Hari";
        String s4 = new String("Java");
        String s5 = new String("Java").intern();
        System.out.println((s1==s2)+ ", String are equal");
        System.out.println((s1==s3) + ", String are not Equal");
        System.out.println((s1==s5) + ", String are Equal");
    }
}
