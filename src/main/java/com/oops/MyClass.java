package com.oops;

abstract public class MyClass {

    //complete method
    public void cal(){
        System.out.println("Calculating result");
    }

    //abstract method
    abstract public void launchRocket();

}

//abstract class can not be instantiated

class start {

    public static void main(String[] args) {

        MyClass cl = new MyChild();
        cl.launchRocket();
        cl.cal();

    }

}
