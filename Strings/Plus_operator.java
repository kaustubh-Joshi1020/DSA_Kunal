package com.kj;

import java.util.ArrayList;

public class Plus_operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // this wil give us the calculated assci value in output
        System.out.println((char) ('a' + 3)); // this will return the single character after addition which is D.


        System.out.println("hi" + new ArrayList<>());// bassically it is going to convert the arraylist values to the string internally it is calling the tostring function.
    }
}
