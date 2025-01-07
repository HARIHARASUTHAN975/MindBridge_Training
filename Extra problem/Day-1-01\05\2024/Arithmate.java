import java.util.Scanner;
interface AdvancedAri {
    int divisor_sum(int n);
}

class MyCalc implements AdvancedAri {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        sum += n;
        return sum;
    }
}


public class Arithmate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCalc myCalculator = new MyCalc();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisor_sum(n));
    }
}
