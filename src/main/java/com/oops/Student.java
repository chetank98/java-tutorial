package com.oops;

public class Student {

    //data: data members: instance variable
    int studentID;
    String studentName;
    String studentCity;

    //non-paramterized constructor
    public Student(){
        System.out.println("creating objects");
    }

    //paramterterized constructor
    public Student(int st){
        System.out.printf("paramterized constructor : %d \n",st);
    }

    public Student(int id, String name, String city) {
        studentID = id;
        studentName = name;
        studentCity = city;
    }


    //Behaviour : member methods : methods : (function)
    public void study(){
        System.out.println(studentName + " is studying");
    }

    public void showFullDetails(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student City: " + studentCity);
    }

}
