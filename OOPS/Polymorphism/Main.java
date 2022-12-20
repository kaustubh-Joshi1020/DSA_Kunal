package com.kj.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        FunctionOverloading functionOverloading = new FunctionOverloading();
//        int ans = functionOverloading.addition(4,6,6, 6);
//        System.out.println(ans);

        Overriding obj = new Overriden(); // this is known as the upcasting. // used to call overriden methods only.
        obj.print(); // this will call the function from Overriden
                    // this is used for access the overrridden method in inheritance only.
                    // or also  calling the overridden method which is in child class in inheritance only.
    }

}
