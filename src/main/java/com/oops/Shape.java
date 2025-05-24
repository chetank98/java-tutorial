package com.oops;

public interface Shape {

    //automatically attached the public static final when we declare the variables in interface.
    public static final int i = 69;


    //automatically attached the public abstract when we declare the methods in interface.
    public  abstract void calculateArea (int r);

}

class Circle implements Shape {

    public void calculateArea(int r) {
        System.out.println("Area of Circle : " + Math.PI * r * r);
    }

    public static void main(String[] args) {

        Shape s1 = new Circle();
        s1.calculateArea(5);

    }

}
