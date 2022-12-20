package com.kj;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first no:");
        int a = input.nextInt();
        System.out.print("Enter the second no:");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("the addition is : "+c);

    }
}
