import java.util.*;
class palindrome
{
    
    public static boolean check(String str)
    {
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean flag=check(str);
        if(flag==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}