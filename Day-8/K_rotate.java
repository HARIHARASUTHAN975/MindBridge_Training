import java.util.Scanner;

public class K_rotate {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String[] str = obj.nextLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        int target=obj.nextInt();
        for(int i=array.length-target;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        for(int i=0;i< array.length-target;i++)
        {
            System.out.print(array[i]+" ");
        }


    }
}
