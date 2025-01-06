import java.util.*;
public class next_Greatest {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String[] str = obj.nextLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = -1;
            {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[i]) {
                        result[i] = array[j];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
