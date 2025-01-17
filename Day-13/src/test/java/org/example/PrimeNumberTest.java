package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {
    @Test
    public void Zero(){
        PrimeNumber PrimeNum=new PrimeNumber();
        boolean result=PrimeNum.Prime(0);
        Assert.assertEquals(false,result);
    }
    @Test
    public void One(){
        PrimeNumber PrimeNum=new PrimeNumber();
        boolean result=PrimeNum.Prime(1);
        Assert.assertEquals(false,result);
    }
    @Test
    public void NegativeNumber(){
        PrimeNumber PrimeNum=new PrimeNumber();
        boolean result=PrimeNum.Prime(-1);
        Assert.assertEquals(false,result);
    }
    @Test
    public void LargestPrimeNumber(){
        PrimeNumber PrimeNum=new PrimeNumber();
        boolean result=PrimeNum.Prime(3000000);
        Assert.assertEquals(false,result);
    }
}