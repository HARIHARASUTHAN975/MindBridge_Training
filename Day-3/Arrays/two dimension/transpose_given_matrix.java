import java.io.*;
import java.util.*;
class transpose_given_matrix
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt();
        int col=obj.nextInt();           
        int[][] array=new int[row][col];
        int[][] result=new int[row][col];
        System.out.println("Enter the Elements in Array :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[i][j]=array[j][i];
            }
        }
        System.out.println("Array Element Before Transpose");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array Element After Transpose");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
}
}