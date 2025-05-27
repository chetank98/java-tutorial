package com.courseRegistration;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Class> registeredClasses;

    public Student(String name) {
        this.name = name;
        this.registeredClasses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Class> getRegisteredClasses() {
        return registeredClasses;
    }

    public boolean registerClass(Class c) {
        for (Class registeredClass : registeredClasses) {
            if (registeredClass.getTimeSlot().equals(c.getTimeSlot())) {
                return false; // Conflict in time
            }
        }
        registeredClasses.add(c);
        return true;
    }

}
