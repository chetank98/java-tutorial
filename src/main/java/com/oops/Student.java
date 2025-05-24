package com.oops;

public class Student {

    //data: data members: instance variable
    int studentID;
    String studentName;
    String studentCity;

    //non-paramterized constructor
    public Student(){
        this(201,"honey","punjab");
        System.out.println("creating objects");
    }

    //paramterterized constructor
    public Student(int st){
        System.out.printf("paramterized constructor : %d \n",st);
    }

    public Student(int id, String studentName, String studentCity) {
        studentID = id;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }


    //Behaviour : member methods : methods : (function)
    public void study(){
        System.out.println(studentName + " is studying");
        System.out.println(this.studentCity);
    }

    public void showFullDetails(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student City: " + studentCity);
    }

}
