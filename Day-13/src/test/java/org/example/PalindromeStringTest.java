package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeStringTest {
    @Test
    public void ValidPalindrome()
    {
        PalindromeString sp=new PalindromeString();
        boolean r=sp.PalinString("malayalam");
        Assert.assertEquals(true,r);
    }
    @Test
    public void InValidPalindrome()
    {
        PalindromeString sp=new PalindromeString();
        boolean r=sp.PalinString("palindrome");
        Assert.assertEquals(false,r);
    }
    @Test
    public void CaseSensitive()
    {
        PalindromeString sp=new PalindromeString();
        boolean r=sp.PalinString("RaceCar");
        Assert.assertEquals(false,r);
    }
    @Test
    public void EmptyString()
    {
        PalindromeString sp=new PalindromeString();
        boolean r=sp.PalinString("");
        Assert.assertEquals(true,r);
    }
}