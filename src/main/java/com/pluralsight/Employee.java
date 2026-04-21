package com.pluralsight;

public class Employee {

    // Attributes
    private String name;
    private int employeeId;
    private double hoursWorked;
    private double payRate;

    // Constructor
    public Employee(int employeeId,String name,double payRate,double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // Method
    public double getGrossPay(){

        return payRate * hoursWorked;
    }

    // Name Setter and Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Employee ID Setter and Getter
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Hours Worked Setter and Getter
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Pay Rate Setter and Getter
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

}
