package com.kj.Interfaces.Nestedinterface;

public class First {

    interface a
    {
        void isodd(int num);
    }
}

class second implements First.a
{

    @Override
    public void isodd(int num) {
        if(num % 2 == 0){
            System.out.println(num + " is a even number");
        }
        else
        {
            System.out.println(num + " is a odd number");
        }
    }

    public static void main(String[] args) {
        second sc = new second();
        sc.isodd(11);
    }
}