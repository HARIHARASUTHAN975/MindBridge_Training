import java.util.*;
public class Two_Sum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String[] str = obj.nextLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        int target=obj.nextInt();
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++) {
                if ((array[i]+array[j])==target) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
