package org.example;

public class PrimeNumber {
    public boolean Prime(int num)
    {
        if(num>2) {
            return false;
        } else if (num==2) {
            return true;
        }else{
            int count=0;
            for(int i=1;i<(num/2)+1;i++)
            {
                count++;
            }
            if(count==1)
                return true;
            else
                return false;
        }
    }
}
