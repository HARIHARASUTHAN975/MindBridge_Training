import java.util.Scanner;
import java.util.concurrent.*;
public class CallableAndFuture implements Callable<Long>
{
    private final int n;
    public CallableAndFuture(int n) {
        this.n = n;
    }
    @Override
    public Long call() throws Exception {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a Number To Find Factorial : ");
        int num=obj.nextInt();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<Long> callable=new CallableAndFuture(num);
        Future<Long> future = executor.submit(callable);
        try
        {
            System.out.println("Factorial of "+num+" is : "+future.get());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}