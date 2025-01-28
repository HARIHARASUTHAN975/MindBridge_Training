import java.util.concurrent.CompletableFuture;
import static java.lang.Thread.sleep;
    public class Completablefuture
    {
        public static void main(String[] args)
        {
            CompletableFuture task1=CompletableFuture.supplyAsync(()->
            {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "Hariharasuthan ";
            });

            CompletableFuture task2=CompletableFuture.supplyAsync(()->
            {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return 100 ;
            });

            CompletableFuture Total=task1.thenCombine(task2,(res1,res2)->
            {
                return res1+" "+res2;
            });

            System.out.println(Total.join());

        }
    }