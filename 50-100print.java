class EvenGen extends Thread
{
    private Object lock;
    public EvenGen(Object lock)
    {
        this.lock=lock;
    }
    public void run()
    {
        for(int i=2;i<=100;i+=2)
        {
            synchronized(lock)
            {
                System.out.println("Even: "+i);
                lock.notify(); //Notify the other thread to print
                try{
                    if(i<100)
                    {
                        lock.wait();
                    }
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class OddGen extends Thread
{
    private Object lock;
    public OddGen(Object lock)
    {
        this.lock=lock;
    }
    public void run()
    {
        for(int i=1;i<=99;i=i+2)
        {
            synchronized(lock)
            {
                System.out.println("Odd: "+i);
                lock.notify();
            
                try
                {
                    if(i<99)
                    {
                        lock.wait();
                    }
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class EvenOddThreadExample
{
    public static void main(String[] args) {
        Object lock=new Object();
        EvenGen e=new EvenGen(lock);
        OddGen o=new OddGen(lock);
        o.start();
        e.start();
    }
}