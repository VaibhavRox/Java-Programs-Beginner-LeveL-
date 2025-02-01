import java.util.Scanner;

public class quicksort {
    public int partition(int A[],int p,int q)
    {
        int pivot=A[p];
        int left=p;
        int right=q;
        while(left<=right)
        {
            if(left<=right && A[left]<=pivot)
            {
                left++;
            }
            else if(left<=right && A[right]>pivot)
            {
                right--;
            }
            if(left<right)
            {
                int temp=A[left];
                A[left]=A[right];
                A[right]=temp;
            }
        }
        //swap right element with pivot after crossing
        A[p]=A[right];
        A[right]=pivot;
        return right;
    }
    public void QSort(int A[],int low,int high)
    {
        if(low<high)
        {
            int j=partition(A,low,high);
            QSort(A, low, j-1);
            QSort(A, j+1, high);
        }
    }
    public void display(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
        }
    }
    public static void main(String[] args) {
        quicksort qs=new quicksort();
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] A=new int[n];
        System.err.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.err.println("Current list");
        qs.display(A);
        qs.QSort(A, 0, n-1);
        System.err.println("Sorted list");
        qs.display(A);
        sc.close();
    }
}