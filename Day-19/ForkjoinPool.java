import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
    public class ForkjoinPool {
        public static int Threshold;
        public static void main(String[] args) {
            final int Threshold=1000;
            ForkJoinPool forkjoinPool=new ForkJoinPool();
            SumTask st=new SumTask(1,1_000_000);
            long result=forkjoinPool.invoke(st);
            System.out.println(result);
        }
    }
    class SumTask extends RecursiveTask<Long> {
        private final int start;
        private final int end;
        public SumTask(int start, int end) {
            this.start=start;
            this.end=end;
        }
        @Override
        protected Long compute()
        {
            if((end-start)<=ForkjoinPool.Threshold)
            {
                return Calculate();
            }
            else
            {
                int middle=(start+end)/2;
                SumTask left=new SumTask(start,middle);
                SumTask right=new SumTask(middle+1,end);
                left.fork();
                right.fork();
                long right_res=right.compute();
                long left_res=left.join();
                return left_res+right_res;
            }
        }
        private Long Calculate() {
            long sum=0;
            for(int i=start;i<=end;i++)
            {
                sum+=i;
            }
            return sum;
        }
}
