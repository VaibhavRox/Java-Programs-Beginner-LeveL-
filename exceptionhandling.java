//create a user defined exception
class Myexception extends Exception
{
    Myexception(String msg)
    {
        super(msg);
    }
}
class Throws
{
    void myMethod(int n) throws Myexception
    {
        if (n<18)
        {
            throw new Myexception("NoT VOTE");
        }
        else
        {
            throw new Myexception("Welcomew");
        }
    }
}
class Test2
{
    public static void main(String[] args) 
    {
        Throws obj=new Throws();
        try
        {
            obj.myMethod(1);
        }
        catch(Myexception e)
        {
            System.out.println(e);
        }
        try
        {
            obj.myMethod(10);
        }
        catch(Myexception e)
        {
            System.out.println(e);
        }
    }
}