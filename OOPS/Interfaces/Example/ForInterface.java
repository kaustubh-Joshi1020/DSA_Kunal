package com.kj.Interfaces.Example;

public class ForInterface implements First , Second{

    @Override
    public void first() {
        System.out.println("calling This is first method");
    }

    @Override
    public void second() {
        System.out.println("calling This is second method");
    }

    public static void main(String[] args) {
        ForInterface obj = new ForInterface();
        obj.first();
    }
}
