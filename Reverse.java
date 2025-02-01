import java.util.*;
public class Reverse
{
    String org;
    public static String reverseString(String org)
    {
        String rev="";
        for (int i=org.length()-1;i>=0;i--)
        {
            rev=rev+org.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String org=sc.nextLine();
        System.out.println("Reversed String:");
        String rev=reverseString(org);
        System.out.println(rev);
        sc.close();
    }
    
}