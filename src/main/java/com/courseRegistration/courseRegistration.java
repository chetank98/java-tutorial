package com.courseRegistration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class courseRegistration {

    public static void main(String[] args) {

            System.out.println("College course registration system using oops");

        // Create professors
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");
        Professor prof3 = new Professor("Dr. Brown");
        Professor prof4 = new Professor("Dr. Taylor");
        Professor prof5 = new Professor("Dr. Wilson");
        Professor prof6 = new Professor("Dr. Davis");

        // Create classes
        Class class1 = new Class("Math 101", "9:00 AM - 10:00 AM", Arrays.asList(prof1));
        Class class2 = new Class("Physics 101", "10:00 AM - 11:00 AM", Arrays.asList(prof2));
        Class class3 = new Class("Chemistry 101", "11:00 AM - 12:00 PM", Arrays.asList(prof3));
        Class class4 = new Class("Biology 101", "9:00 AM - 10:00 AM", Arrays.asList(prof4));
        Class class5 = new Class("History 101", "10:00 AM - 11:00 AM", Arrays.asList(prof5));
        Class class6 = new Class("English 101", "11:00 AM - 12:00 PM", Arrays.asList(prof6));

        // Assign classes to professors
        prof1.assignClass(class1);
        prof2.assignClass(class2);
        prof3.assignClass(class3);
        prof4.assignClass(class4);
        prof5.assignClass(class5);
        prof6.assignClass(class6);

        // Create departments
        Department science = new Department("Science", Arrays.asList(class1, class2, class3));
        Department arts = new Department("Arts", Arrays.asList(class4, class5, class6));

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Register students for classes
        student1.registerClass(class1);
        student1.registerClass(class2);
        student2.registerClass(class4);
        student2.registerClass(class5);

        // Print student schedules
        System.out.println(student1.getName() + "'s Schedule:");
        for (Class c : student1.getRegisteredClasses()) {
            System.out.println(c.getName() + " at " + c.getTimeSlot());
        }

        System.out.println(student2.getName() + "'s Schedule:");
        for (Class c : student2.getRegisteredClasses()) {
            System.out.println(c.getName() + " at " + c.getTimeSlot());
        }

    }

}
