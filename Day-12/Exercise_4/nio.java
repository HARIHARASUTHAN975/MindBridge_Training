package Exercise_4;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.util.*;
public class nio {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Capacity of Numbers:");
        int num=obj.nextInt();
        IntBuffer inputbuffer=IntBuffer.allocate(num);
        System.out.println("Enter the Numbers:");
        for(int i=0;i<num;i++)
        {
            inputbuffer.put(obj.nextInt());
        }
        inputbuffer.flip();
        System.out.println("Current Position:"+inputbuffer.position());
        System.out.println("Numbers:");
        while(inputbuffer.hasRemaining())
        {
            System.out.println(inputbuffer.get());
        }
        System.out.println("Total Capacity:"+inputbuffer.capacity());
        System.out.println("---------------------------------");
        System.out.println("Enter the Word:");
        String str=obj.next();
        CharBuffer charbuffer=CharBuffer.allocate(256);
        for(char i:str.toCharArray())
        {
            charbuffer.put(i);
        }
        charbuffer.flip();
        System.out.println("Current Position:"+charbuffer.position());
        System.out.println("Characters");
        while(charbuffer.hasRemaining())
        {
            System.out.println(charbuffer.get());
        }
        System.out.println("Total Capacity:"+charbuffer.capacity());
    }
}
