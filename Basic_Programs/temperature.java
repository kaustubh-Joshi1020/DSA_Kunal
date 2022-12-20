package com.kj;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter temperature in celcious to farenheit:");
        float celcious = input.nextFloat();
        float fer;
        fer = (celcious * 9/5) + 32;
        System.out.println("the temperature is:"+ fer);
    }
}
