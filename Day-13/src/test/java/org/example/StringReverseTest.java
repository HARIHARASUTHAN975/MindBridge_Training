package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverseTest {
    @Test
    public void NullString() {
        StringReverse rs = new StringReverse();
        String r = rs.revString("");
        Assert.assertEquals("", r);
    }
    @Test
    public void SingleString() {
        StringReverse rs = new StringReverse();
        String r = rs.revString("a");
        Assert.assertEquals("a", r);
    }
    @Test
    public void SpecialString() {
        StringReverse rs = new StringReverse();
        String r = rs.revString("@");
        Assert.assertEquals("@", r);
    }
    @Test
    public void NumberString() {
        StringReverse rs = new StringReverse();
        String r = rs.revString("01234");
        Assert.assertEquals("43210", r);
    }
    @Test
    public void PalindromeString() {
        StringReverse rs = new StringReverse();
        String r = rs.revString("malayalam");
        Assert.assertEquals("malayalam", r);
    }

}