package com.oops;

public class Demo {

    public static void main(String[] args) {

        //creating objects of student
        System.out.println("Student 1 details :- ");

        Student s1;
        s1 = new Student();

        s1.studentName = "Ram";
        s1.studentID = 123;
        s1.studentCity = "Delhi";

        s1.study();
        s1.showFullDetails();

        System.out.println("Student 2 details :- ");

        Student st2 =  new Student(12);

        st2.studentName = "Shyam";
        st2.studentID = 321;
        st2.studentCity = "Uttar Pradesh";

        st2.study();
        st2.showFullDetails();


        System.out.println("Student 3 details :- ");

        Student st3 = new Student(101, "Arjun","Haryana");

        st3.study();
        st3.showFullDetails();


    }

}
