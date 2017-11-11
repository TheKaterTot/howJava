package com.tatertot;

public class Employee extends Person {
    private int employeeID;

    public Employee(String firstName, String lastName, int employeeID) {
        super(firstName, lastName);
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}
