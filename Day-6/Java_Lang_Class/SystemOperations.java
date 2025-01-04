package Java_Lang_Class;
public class SystemOperations {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i=0;i<1000000;i++)
        {

        }
        long endTime=System.currentTimeMillis();
        System.out.println("Execution time of the loop: "+(endTime-startTime)+" milliseconds");
        }
    }