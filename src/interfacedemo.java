interface Backend
{
    public void connect();
}
class frontend
{
    public void response(String Str)
    {
        System.out.println(Str + " is used for frontend");
    }
}
class language extends frontend implements Backend
{
    String language = "Java";
    public void connect(){
        System.out.println(language + " is used for backend");
    }
    public static void main(String args[])
    {
        language Java = new language();
        Java.connect();
        Java.response(Java.language);
    }
}
