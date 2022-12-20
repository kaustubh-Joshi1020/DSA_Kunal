package com.kj.objectcloning;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

    Student obj = new Student(07,"Kaustubh");
    Student obj2 = (Student)obj.clone();
        System.out.println(obj2.name);
        System.out.println(Arrays.toString(obj2.arr));

        obj2.arr[0] = 100;
        System.out.println(Arrays.toString(obj2.arr));
    }
}
