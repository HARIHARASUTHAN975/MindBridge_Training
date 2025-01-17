package org.example;

public class PalindromeString {
    public Boolean PalinString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String str2=stringBuilder.toString();
        return str.equals(str2);
    }
}
