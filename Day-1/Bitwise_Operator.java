import java.util.*;
public class Bitwise_Operator
{
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int num=obj.nextInt();
            System.out.println("Original number:"+num);
            int leftShift=num<<2;
            System.out.println("After left shift : "+leftShift);
            int rightShift=num>>2;
            System.out.println("After right shift : "+rightShift);
            System.out.println("XOR Operation");
            int num1=obj.nextInt();
            int num2=obj.nextInt();
            int xorResult=num1^num2;
            System.out.println("XOR result: "+xorResult);
        }
    }