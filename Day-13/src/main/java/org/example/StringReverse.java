package org.example;

public class StringReverse {
    public String revString(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
