/*Write a java program to implement thread synchronization to print n prime numbers using thread */

class PrintPrime
{
    int c=0;
    int n;
    Object lock=new Object();
    public PrintPrime(int n)
    {
        this.n=n;
    }
    public boolean isPrime(int n)
    {
        if(n<=1){return false;}
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    class PrimeThread extends Thread
    {
       
        
        public void run()
        {
            int num=2; //starting prime num
            while(true)
            {
                synchronized(lock)
                {
                    if(c>=n)
                    {
                        break;
                    }
                    if(isPrime(num))
                    {
                        System.out.println("Prime number: "+num);
                        c++;
                    }
                    num++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        PrintPrime p= new PrintPrime(n);
        PrimeThread t1=p.new PrimeThread();
        PrimeThread t2=p.new PrimeThread();
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
