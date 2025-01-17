package org.example;

public class FactorailCalculator {
    public static long print(int n)
    {
        if(n<0) {
            System.out.println("Number Should be Greater Than Zero!");
            return 0;
        }
        long Result=1;
        for(int i=n;i>=1;i--) {
            Result *= i;
        }
        return Result;
    }
}
