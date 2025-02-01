class Print
{
    public synchronized void print(String msg)
    {
        System.out.print("["+msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("]");
    }
}
class Thread1 extends Thread
{
    Print p;
    String msg;
    public Thread1(Print p,String msg)
    {
        this.p=p;
        this.msg=msg;
    }
    public void run()
    {
        p.print(msg);
    }
}
class Test
{
    public static void main(String[] args) {
        Print p=new Print();
        Thread1 t1=new Thread1(p, "HElo");
        Thread1 t2=new Thread1(p, "Puff");
        t1.start();
        t2.start();
    }
}