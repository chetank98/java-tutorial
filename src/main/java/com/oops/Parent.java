package com.oops;


class A {

}

class B extends A {

}

public class Parent {

    //overridden method
    public A m1 () {
        System.out.println("I am m1() of parent");
        return new A();
    }

}

//accessibility ->  public > default > protected > private

class Child extends Parent {

    //overriding method
    //co-variant returns types are allowed when return type is different
    public B m1() {
        System.out.println("I am m1() of child");
        return new B();
    }
}
