package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorailCalculatorTest
{
    @Test
    public void Zero()
    {
        FactorailCalculator fact = new FactorailCalculator();
        long r = fact.print(0);
        Assert.assertEquals(1, r);
    }
    @Test
    public void smallPositiveNumber()
    {
        FactorailCalculator fact = new FactorailCalculator();
        long r = fact.print(5);
        Assert.assertEquals(120, r);
    }
    @Test
    public void NegativeNumber()
    {
        assertThrows(IllegalArgumentException.class, new Runnable() {
            @Override
            public void run() {
                FactorailCalculator.print(-1);
            }
        });
    }
    private void assertThrows (Class < IllegalArgumentException > illegalArgumentExceptionClass, Runnable runnable){
    }
}