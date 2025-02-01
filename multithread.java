import java.util.Random;

class Even extends Thread
{
    public int a;
    public Even(int a)
    {
        this.a=a;
    }
    public void run()
    {
        System.out.println("The thread is Even and square of "+a+"is:"+a*a);
    }
}

class Odd extends Thread
{
    public int a;
    public Odd(int a)
    {
        this.a=a;
    }
    public void run()
    {
        System.out.println("The thread is Odd and cube of "+a+"is:"+a*a*a);
    }
}
class RandGen extends Thread
{
    public void run()
    {
        int n=0;
        Random rand=new Random();
        try
        {
            for(int i=0;i<10;i++)
            {
                n=rand.nextInt(20);
                System.out.println("Generated number is:"+n);
                if(n%2==0)
                {
                    Even e=new Even(n);
                    e.start();
                }
                else
                {
                    Odd o=new Odd(n);
                    o.start();
                }
                Thread.sleep(1000);
                System.out.println("-----------------------------");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class multithread
{
    public static void main(String[] args) {
        RandGen rg=new RandGen();
        rg.start();
    }
}