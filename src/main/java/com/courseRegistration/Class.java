package com.courseRegistration;

import java.util.List;

public class Class {

    private String name;
    private String timeSlot;
    private List<Professor> professors;

    public Class(String name, String timeSlot, List<Professor> professors) {
        this.name = name;
        this.timeSlot = timeSlot;
        this.professors = professors;
    }

    public String getName() {
        return name;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public List<Professor> getProfessors() {
        return professors;
    }
}
