package com.kj.Polymorphism;

//public class thread extends Thread {
//    public void run()
//    {
//        System.out.println("this is thread");
//    }
//
//    public static void main(String[] args) {
//        thread t = new thread();
//        t.start();
//    }
//}

public class thread implements Runnable {
    public void run()
    {
        System.out.println("this is thread");
    }

    public static void main(String[] args) {
        thread t = new thread();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
