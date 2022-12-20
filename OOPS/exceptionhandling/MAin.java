package com.kj.exceptionhandling;

public class MAin {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
            divide(a,b);
        }
        catch (Exception e){
            System.out.println("catched normal exception");
        }

        finally {
            System.out.println("i am executing even if exception occurs");
        }
    }

        static int divide ( int a, int b) throws ArithmeticException { //this is how we can create our own exception
            if (b == 0) {
                throw new ArithmeticException("zero se divide nahi hota!");
            }
            return a / b;
        }

}