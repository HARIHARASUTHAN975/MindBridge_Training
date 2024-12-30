import java.io.*;
import java.util.*;
class add_2D_array
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt();
        int col=obj.nextInt();
        
        int[][] array1=new int[row][col];
        int[][] array2=new int[row][col];
        int[][] result=new int[row][col];
        System.out.println("Enter the Elements in Array 1 :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array1[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter the Elements in Array 2 :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array2[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[i][j]=array1[i][j]+array2[i][j];
            }
        }
        System.out.println("Array Element in Array 1 :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Array Element in Array 2 :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Resultant Array : ");
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