import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorsAndVisualVM {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter A Number for Limit : ");
        int size=obj.nextInt();
        for (int i = 1; i <size; i++) {
            int num=i;
            executor.submit(()->
            {
                System.out.println(num+ " Task executed by "+Thread.currentThread().getName());
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            });
        }
    }
};