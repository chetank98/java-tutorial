package com.multiThreading;

public class multiThreading {

    public static void main(String[] args) {

//        World w = new World();
//        w.start();
//        for (; ; ) {
//            System.out.println("Hello");
//        }

        MyThread h = new MyThread();
        Thread t = new Thread(h);
        t.start();
        for (; ; ) {
            System.out.println("World");
        }
    }

//    public static class World extends Thread{
//        @Override
//        public void run(){
//            for (; ; ) {
//                System.out.println("World");
//            }
//        }
//    }

    public static class MyThread implements Runnable{
        @Override
        public void run(){
            for (; ; ) {
                System.out.println("Hello");
            }
        }
    }

}
