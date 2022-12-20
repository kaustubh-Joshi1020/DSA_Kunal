package com.kj;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter index: ");
        int num = input.nextInt();
        int first = 0; //first number of fibonacci
        int second = 1;//second number of fibonacci
        int addition = 2;

        while (addition <= num )
        {
            int temp = second;
            second = first+ second;
            first = temp;
            addition++;
        }
        System.out.println(second);

    }
}
//    int a = 0;
//    int b = 1;
//    int count = 2;
//
//
//        while (count<=num){
//                int temp = b;
//                b = a + b;
//                a = temp; // b is going to be a
//                count++;
//                }
//                System.out.println(b);

//    int a = 0;
//    int b = 1;
//
//        for (int c = 0; c < 10; c++) {
//        int temp = b;
//        b = b + a;
//        a   = temp ;
//
//        System.out.println(b);
