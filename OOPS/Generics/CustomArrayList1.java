package com.kj.Generics;

public class CustomArrayList1 {
   private int[] data;
   private static int DEFAULT_SIZE = 10;
   int size = 0;

    public CustomArrayList1() {
        this.data = new int[DEFAULT_SIZE];
    }

    void add(int num) {
       if(isfull())
       {
           resize();
       }
       data[size++] =num ;

   }

    private void resize() {

    }

    private boolean isfull() {
        return size == data.length;
    }

}
