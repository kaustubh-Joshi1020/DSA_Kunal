package com.kj;

public class noOccurance {
    public static void main(String[] args) {
        int num = 123435363;
        int count = 0;
        while(num > 0)
        {
             int rem = num % 10;
             if(rem == 3)
             {
                 count++;
             }
             num = num / 10;

        }
        System.out.println(count);
    }
}
