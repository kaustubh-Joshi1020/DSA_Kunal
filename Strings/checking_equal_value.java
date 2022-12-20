package com.kj;

public class checking_equal_value {
    public static void main(String[] args) {
        String a = "i am java";
        String b = new String("i am java");

        System.out.println(a == b); // this checks is both variables is pointing to the same object
        System.out.println(a.equals(b)); // this checks the actual value of object is same or not
    }
}
