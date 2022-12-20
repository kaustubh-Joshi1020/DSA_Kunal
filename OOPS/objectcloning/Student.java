package com.kj.objectcloning;

public class Student implements Cloneable {
    int roll_no;
    String name;
    int  arr[];

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
        this.arr = new int[]{1,2,34,5,56,6};
    }

    public Student(Student other){
        this.roll_no = other.roll_no;
        this.name = other.name;
        this.arr = other.arr;
    }

    public Object clone() throws CloneNotSupportedException{ // this is must require for cloning object
        return super.clone();
    }

}
