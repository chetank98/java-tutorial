package com.oops;

public class Dog extends Animal {

    public Dog(){
        //this must be first line.
        super();
        System.out.println("child class constructor ");
    }

    int x = 4;

    public void speak(){
        System.out.println("this is parent class x " + super.x);
        System.out.println("this is child class x " + this.x);
    }

}
