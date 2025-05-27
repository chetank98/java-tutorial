package com.courseRegistration;

import java.util.List;

public class Department {

    private String name;
    private List<Class> classes;

    public Department(String name, List<Class> classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public List<Class> getClasses() {
        return classes;
    }

}

