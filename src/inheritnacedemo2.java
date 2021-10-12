class animal
{
    public void eat()
    {
        System.out.println("I can eat");
    }
}
class dog extends animal
{
    @Override
    public void eat(){
        System.out.println("I eat chicken");
    }
    public void sleep()
    {
        System.out.println("i will sleep");
    }
}
class inheritnacedemo2{
    public static void main(String args[]){
        dog labs = new dog();

        labs.eat();
        labs.sleep();
    }
}