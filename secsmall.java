import java.util.*;
public class secsmall {
    public static int  Sort(int[] array)
    {
        int n=array.length;
        int temp=0;
        for (int i=0;i<n-1;i++)
        {
            for( int j=0;j<n-i-1;j++)
            {
                if (array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        //new array to store unique elements
        int[] unique=new int[n];
        int uniqueCount=0;
        unique[uniqueCount]=array[0];
        uniqueCount++;
        for (int i=1;i<n;i++)
        {
            if (array[i]!=array[i-1])       //Add to unique only if its different
            {
                unique[uniqueCount]=array[i];
                uniqueCount++;
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(unique[i]+" ");
        }
        return unique[1];

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter elements of array:");
        for (int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("The Current array:");
        for (int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int secsm=Sort(array);
        System.out.print("The Second Smallest element in the array:"+secsm);
        sc.close();
    }
}
