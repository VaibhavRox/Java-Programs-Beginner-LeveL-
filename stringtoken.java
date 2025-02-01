import java.util.*;
class stringtoken
{
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line of integers with space in between");
        String s1=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s1," ");
        while(st.hasMoreTokens())
        {
            String t=st.nextToken();
            n=Integer.parseInt(t);
            System.out.print(n+",");
            sum=sum+n;
        }
        System.out.println("Sum of integers entered:"+sum);
        sc.close();
    }
}