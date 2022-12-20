package com.kj;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return num*10;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) throws Throwable {
        ObjectDemo obj1 = new ObjectDemo(15);
        ObjectDemo obj2  = new ObjectDemo(15);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        if ( obj1 == obj2){  // this returns true if the object pointing to the same value
            System.out.println("object one is equal to object 2");
        }

        if ( obj1.equals(obj2)){  // here equals function return true if the value is same
            System.out.println("the values of both object is same");
        }


    }
}
