package com.kj.Interfaces.DefaultMethod;

public interface B extends A {

    static void display1()
    {
        System.out.println("this is a static method in interface A");
    }

    default void display(){
        System.out.println("i am a default method in classs b");
    }
}
