package com.kj.Interfaces.Example;

public class Car implements Engine , Brake{
    public void start(){
        System.out.println("i start like a normal car");
    }

    public void stop(){
        System.out.println("i stop like a normal car");
    }

    public void acc(){
        System.out.println("i start like a normal car");

    }

    public void brake(){
        System.out.println("i brake like a normal car");
    }
}
