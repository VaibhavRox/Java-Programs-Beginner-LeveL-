interface First
{
    public void firstMethod();  //interface method, cant put body of method here
}
interface Second
{
    public void secondMethod();
}
class Body implements First,Second
{
    public void firstMethod()
    {
        System.out.println("This is the first interface calling!!");
    }
    public void secondMethod()
    {
        System.out.println("This is the second interface calling!!");
    }
}
class interface1
{
    public static void main(String[] args)
    {
        Body obj=new Body();
        obj.firstMethod();
        obj.secondMethod();
    }
}