class constructdemo{
    String name;

    public constructdemo()
    {
        this.name = "hari";
    }
    public constructdemo(String name)
    {
        this.name= name;

    }
    public void getname()
    {
        System.out.println("My name is: " + this.name);
    }
    public static void main(String[] args)
    {
        constructdemo obj = new constructdemo();  // call constructor with no parameter

        constructdemo obj1 = new constructdemo("hari corp"); // call constructor with single parameter

        obj.getname();
        obj1.getname();
    }

}