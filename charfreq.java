import java.util.*;
public class charfreq {
    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Enter character to search");
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                c++;
            }
        }
        System.out.println("Frequency of "+ch+" is "+c);
        sc.close();

    }
}
