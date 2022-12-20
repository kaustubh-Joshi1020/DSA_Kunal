package com.kj;

public class reverse {
    public static void main(String[] args) {
        int num = 7654321;

        int ans = 0;

        while(num > 0)
        {
           int rem  = num % 10 ; // num modulo 10 is storing in remainder

            num = num /10;       // dividing num by 10 in loop

            ans = ans * 10 + rem; // multiplying answer by 10 then adding remainder

        }

        System.out.println(ans);

    }
}
