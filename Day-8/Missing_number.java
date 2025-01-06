import java.util.*;

public class Missing_number {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String[] str = obj.nextLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        int num= array.length;
        int act=0;
        int expect=num*(num+1)/2;
        for (int i:array) {
            act+=i;
        }
        System.out.println(expect-act);
    }
}