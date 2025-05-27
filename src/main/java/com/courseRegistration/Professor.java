package com.courseRegistration;


import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String name;
    private List<Class> assignedClasses;

    public Professor(String name) {
        this.name = name;
        this.assignedClasses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Class> getAssignedClasses() {
        return assignedClasses;
    }

    public boolean assignClass(Class c) {
        for (Class assignedClass : assignedClasses) {
            if (assignedClass.getTimeSlot().equals(c.getTimeSlot())) {
                return false; // Conflict in time
            }
        }
        assignedClasses.add(c);
        return true;
    }

}
