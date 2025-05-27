package com.courseRegistration;

import java.util.List;

public class Department {

    private int id;
    private String departmentName;
    private List<Class> classes;

    public Department() {
    }

    public Department(int id, String departmentName, List<Class> classes) {
        this.id = id;
        this.departmentName = departmentName;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes){
            this.classes = classes;
    }

}
