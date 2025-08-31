package com.multiThreading;

public class multiThreading2 {

    public static class MyThread extends Thread {
        @Override
        public void run(){
            System.out.println("MyThread is running"); //Runnning
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println(thread.getState()); //New
        thread.start();
        System.out.println(thread.getState()); //Runnable
        Thread.sleep(5000);
        System.out.println(thread.getState());  //Timed waiting
        thread.join();
        System.out.println(thread.getState()); //Terminated


    }

}
