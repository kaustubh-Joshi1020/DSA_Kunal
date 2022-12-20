package com.kj;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a;
        int b ;
        int ans = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the action to perform:");
        char choice =  input.next().trim().charAt(0);

        System.out.print("enter the first number:");
        a = input.nextInt();

        System.out.print("enter the second number:");
        b = input.nextInt();


        if ( choice == '+')
        {
            ans = a + b;
        }

        if ( choice == '-')
        {
            ans = a - b;
        }

        if ( choice == '*')
        {
            ans = a * b;
        }

        if ( choice == '/')
        {
            ans = a / b;
        }
        System.out.println("the answer is:"+ans);
    }
}
