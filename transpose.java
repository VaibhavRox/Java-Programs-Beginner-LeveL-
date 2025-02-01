import java.util.*;
class java
{
    public static void display(int[][] Matrix, int r,int c)
    {
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int cols=sc.nextInt();
        //Initialize the matrix
        int[][] mat=new int[rows][cols];
        //Input the elements
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter the element:");
                mat[i][j]=sc.nextInt();
            }
        }
        //Display original matrix
        System.out.println("Original Matrix:");
        display(mat,rows,cols);
        //find the transpose
        int[][] trans=new int[cols][rows];
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                trans[j][i]=mat[i][j];
            }
        }
        //Display transpose
        System.out.println("Transpose Matrix:");
        display(trans, cols, rows);
        sc.close();

    }


}